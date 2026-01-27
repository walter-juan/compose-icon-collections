package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.CloudUploadAlt: ImageVector
    get() {
        if (_cloudUploadAlt != null) {
            return _cloudUploadAlt!!
        }
        _cloudUploadAlt = Builder(name = "CloudUploadAlt", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 480.0f)
                curveToRelative(-79.5f, 0.0f, -144.0f, -64.5f, -144.0f, -144.0f)
                curveToRelative(0.0f, -63.4f, 41.0f, -117.2f, 97.9f, -136.5f)
                curveToRelative(-1.3f, -7.7f, -1.9f, -15.5f, -1.9f, -23.5f)
                curveToRelative(0.0f, -79.5f, 64.5f, -144.0f, 144.0f, -144.0f)
                curveToRelative(55.4f, 0.0f, 103.5f, 31.3f, 127.6f, 77.1f)
                curveToRelative(14.2f, -8.3f, 30.8f, -13.1f, 48.4f, -13.1f)
                curveToRelative(53.0f, 0.0f, 96.0f, 43.0f, 96.0f, 96.0f)
                curveToRelative(0.0f, 15.7f, -3.8f, 30.6f, -10.5f, 43.7f)
                curveToRelative(44.0f, 20.3f, 74.5f, 64.7f, 74.5f, 116.3f)
                curveToRelative(0.0f, 70.7f, -57.3f, 128.0f, -128.0f, 128.0f)
                lineToRelative(-304.0f, 0.0f)
                close()
                moveTo(305.0f, 191.0f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                lineToRelative(-72.0f, 72.0f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0.0f, 33.9f)
                reflectiveCurveToRelative(24.6f, 9.4f, 33.9f, 0.0f)
                lineToRelative(31.0f, -31.0f)
                lineToRelative(0.0f, 102.1f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                lineToRelative(0.0f, -102.1f)
                lineToRelative(31.0f, 31.0f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(-72.0f, -72.0f)
                close()
            }
        }
        .build()
        return _cloudUploadAlt!!
    }

private var _cloudUploadAlt: ImageVector? = null
