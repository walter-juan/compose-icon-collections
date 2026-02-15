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

public val BrandsGroup.TorBrowser: ImageVector
    get() {
        if (_torBrowser != null) {
            return _torBrowser!!
        }
        _torBrowser = Builder(name = "TorBrowser", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.5f, 465.4f)
                lineToRelative(0.0f, -31.0f)
                curveToRelative(98.3f, -0.3f, 177.9f, -80.0f, 177.9f, -178.4f)
                reflectiveCurveTo(354.8f, 77.9f, 256.5f, 77.6f)
                lineToRelative(0.0f, -31.0f)
                curveTo(372.0f, 46.8f, 465.4f, 140.5f, 465.4f, 256.0f)
                reflectiveCurveTo(372.0f, 465.2f, 256.5f, 465.4f)
                close()
                moveTo(256.5f, 356.8f)
                curveToRelative(55.4f, -0.3f, 100.3f, -45.3f, 100.3f, -100.8f)
                reflectiveCurveTo(312.0f, 155.5f, 256.5f, 155.2f)
                lineToRelative(0.0f, -31.0f)
                curveToRelative(72.6f, 0.3f, 131.4f, 59.2f, 131.4f, 131.8f)
                reflectiveCurveTo(329.1f, 387.6f, 256.5f, 387.8f)
                lineToRelative(0.0f, -31.0f)
                close()
                moveTo(256.5f, 201.7f)
                curveToRelative(29.7f, 0.3f, 53.8f, 24.5f, 53.8f, 54.3f)
                reflectiveCurveToRelative(-24.0f, 54.0f, -53.8f, 54.3f)
                lineToRelative(0.0f, -108.6f)
                close()
                moveTo(0.0f, 256.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 512.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, -512.0f, 0.0f)
                close()
            }
        }
        .build()
        return _torBrowser!!
    }

private var _torBrowser: ImageVector? = null
