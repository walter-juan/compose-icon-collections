package com.woowla.compose.icon.collections.fontawesome.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.BrandsGroup

public val BrandsGroup.Ultralytics: ImageVector
    get() {
        if (_ultralytics != null) {
            return _ultralytics!!
        }
        _ultralytics = Builder(name = "Ultralytics", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(391.4f, 39.7f)
                curveToRelative(65.8f, -0.2f, 118.6f, 51.8f, 120.4f, 116.6f)
                curveToRelative(0.7f, 26.4f, -1.5f, 54.1f, -3.8f, 74.1f)
                curveToRelative(-17.2f, 148.6f, -122.4f, 242.0f, -252.4f, 242.0f)
                curveToRelative(-95.4f, -0.1f, -179.4f, -52.7f, -223.2f, -130.6f)
                curveToRelative(24.4f, 17.4f, 54.5f, 27.4f, 87.6f, 27.4f)
                curveToRelative(83.2f, 0.1f, 151.4f, -67.4f, 151.2f, -150.0f)
                lineToRelative(0.1f, -60.6f)
                curveToRelative(-0.2f, -65.7f, 53.9f, -119.0f, 120.1f, -118.9f)
                close()
                moveTo(119.9f, 100.2f)
                curveToRelative(66.2f, 0.0f, 119.9f, 53.3f, 119.9f, 119.0f)
                reflectiveCurveTo(186.1f, 338.3f, 119.9f, 338.3f)
                reflectiveCurveTo(0.0f, 285.0f, 0.0f, 219.3f)
                curveToRelative(0.0f, -65.7f, 53.7f, -119.0f, 119.9f, -119.0f)
                close()
            }
        }
        .build()
        return _ultralytics!!
    }

private var _ultralytics: ImageVector? = null
