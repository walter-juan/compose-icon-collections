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

public val SolidGroup.FaceGrinBeam: ImageVector
    get() {
        if (_faceGrinBeam != null) {
            return _faceGrinBeam!!
        }
        _faceGrinBeam = Builder(name = "FaceGrinBeam", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 512.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, -512.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, 512.0f)
                close()
                moveTo(386.7f, 308.9f)
                curveToRelative(11.9f, -3.7f, 23.9f, 6.3f, 19.6f, 18.1f)
                curveToRelative(-22.4f, 61.3f, -81.3f, 105.1f, -150.3f, 105.1f)
                reflectiveCurveTo(128.1f, 388.2f, 105.7f, 326.9f)
                curveToRelative(-4.3f, -11.8f, 7.7f, -21.8f, 19.6f, -18.1f)
                curveToRelative(39.2f, 12.2f, 83.7f, 19.1f, 130.7f, 19.1f)
                reflectiveCurveToRelative(91.5f, -6.9f, 130.7f, -19.1f)
                close()
                moveTo(176.0f, 180.0f)
                curveToRelative(-15.5f, 0.0f, -28.0f, 12.5f, -28.0f, 28.0f)
                lineToRelative(0.0f, 8.0f)
                curveToRelative(0.0f, 11.0f, -9.0f, 20.0f, -20.0f, 20.0f)
                reflectiveCurveToRelative(-20.0f, -9.0f, -20.0f, -20.0f)
                lineToRelative(0.0f, -8.0f)
                curveToRelative(0.0f, -37.6f, 30.4f, -68.0f, 68.0f, -68.0f)
                reflectiveCurveToRelative(68.0f, 30.4f, 68.0f, 68.0f)
                lineToRelative(0.0f, 8.0f)
                curveToRelative(0.0f, 11.0f, -9.0f, 20.0f, -20.0f, 20.0f)
                reflectiveCurveToRelative(-20.0f, -9.0f, -20.0f, -20.0f)
                lineToRelative(0.0f, -8.0f)
                curveToRelative(0.0f, -15.5f, -12.5f, -28.0f, -28.0f, -28.0f)
                close()
                moveTo(308.0f, 208.0f)
                lineToRelative(0.0f, 8.0f)
                curveToRelative(0.0f, 11.0f, -9.0f, 20.0f, -20.0f, 20.0f)
                reflectiveCurveToRelative(-20.0f, -9.0f, -20.0f, -20.0f)
                lineToRelative(0.0f, -8.0f)
                curveToRelative(0.0f, -37.6f, 30.4f, -68.0f, 68.0f, -68.0f)
                reflectiveCurveToRelative(68.0f, 30.4f, 68.0f, 68.0f)
                lineToRelative(0.0f, 8.0f)
                curveToRelative(0.0f, 11.0f, -9.0f, 20.0f, -20.0f, 20.0f)
                reflectiveCurveToRelative(-20.0f, -9.0f, -20.0f, -20.0f)
                lineToRelative(0.0f, -8.0f)
                curveToRelative(0.0f, -15.5f, -12.5f, -28.0f, -28.0f, -28.0f)
                reflectiveCurveToRelative(-28.0f, 12.5f, -28.0f, 28.0f)
                close()
            }
        }
        .build()
        return _faceGrinBeam!!
    }

private var _faceGrinBeam: ImageVector? = null
