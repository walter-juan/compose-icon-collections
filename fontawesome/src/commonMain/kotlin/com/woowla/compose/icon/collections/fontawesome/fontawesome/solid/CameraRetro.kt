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

public val SolidGroup.CameraRetro: ImageVector
    get() {
        if (_cameraRetro != null) {
            return _cameraRetro!!
        }
        _cameraRetro = Builder(name = "CameraRetro", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.6f, 121.2f)
                lineTo(271.1f, 96.0f)
                lineTo(448.0f, 96.0f)
                lineToRelative(0.0f, 96.0f)
                lineToRelative(-114.8f, 0.0f)
                curveToRelative(-21.9f, -15.1f, -48.5f, -24.0f, -77.2f, -24.0f)
                reflectiveCurveToRelative(-55.2f, 8.9f, -77.2f, 24.0f)
                lineTo(64.0f, 192.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(128.0f, 0.0f)
                curveToRelative(9.9f, 0.0f, 19.7f, -2.3f, 28.6f, -6.8f)
                close()
                moveTo(0.0f, 128.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(384.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -320.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(271.1f, 32.0f)
                curveToRelative(-9.9f, 0.0f, -19.7f, 2.3f, -28.6f, 6.8f)
                lineTo(192.0f, 64.0f)
                lineToRelative(-32.0f, 0.0f)
                lineToRelative(0.0f, -16.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                lineTo(80.0f, 32.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                lineToRelative(0.0f, 16.0f)
                curveTo(28.7f, 64.0f, 0.0f, 92.7f, 0.0f, 128.0f)
                close()
                moveTo(168.0f, 304.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 176.0f, 0.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, -176.0f, 0.0f)
                close()
            }
        }
        .build()
        return _cameraRetro!!
    }

private var _cameraRetro: ImageVector? = null
