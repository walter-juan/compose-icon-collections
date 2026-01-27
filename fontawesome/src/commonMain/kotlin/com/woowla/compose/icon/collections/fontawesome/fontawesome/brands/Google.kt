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

public val BrandsGroup.Google: ImageVector
    get() {
        if (_google != null) {
            return _google!!
        }
        _google = Builder(name = "Google", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(500.0f, 261.8f)
                curveTo(500.0f, 403.3f, 403.1f, 504.0f, 260.0f, 504.0f)
                curveTo(122.8f, 504.0f, 12.0f, 393.2f, 12.0f, 256.0f)
                reflectiveCurveTo(122.8f, 8.0f, 260.0f, 8.0f)
                curveToRelative(66.8f, 0.0f, 123.0f, 24.5f, 166.3f, 64.9f)
                lineToRelative(-67.5f, 64.9f)
                curveToRelative(-88.3f, -85.2f, -252.5f, -21.2f, -252.5f, 118.2f)
                curveToRelative(0.0f, 86.5f, 69.1f, 156.6f, 153.7f, 156.6f)
                curveToRelative(98.2f, 0.0f, 135.0f, -70.4f, 140.8f, -106.9f)
                lineToRelative(-140.8f, 0.0f)
                lineToRelative(0.0f, -85.3f)
                lineToRelative(236.1f, 0.0f)
                curveToRelative(2.3f, 12.7f, 3.9f, 24.9f, 3.9f, 41.4f)
                close()
            }
        }
        .build()
        return _google!!
    }

private var _google: ImageVector? = null
