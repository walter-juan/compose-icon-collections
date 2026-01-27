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
                moveTo(0.0f, 416.0f)
                lineToRelative(0.0f, -208.0f)
                lineToRelative(136.2f, 0.0f)
                curveToRelative(13.5f, -20.2f, 32.0f, -36.8f, 53.7f, -48.0f)
                lineTo(0.0f, 160.0f)
                lineTo(0.0f, 125.7f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                lineToRelative(0.1f, 0.0f)
                curveTo(65.3f, 45.1f, 79.1f, 32.0f, 96.0f, 32.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(16.9f, 0.0f, 30.7f, 13.1f, 31.9f, 29.7f)
                lineToRelative(32.1f, 0.0f)
                lineToRelative(51.2f, -23.8f)
                curveToRelative(8.4f, -3.9f, 17.6f, -6.0f, 26.9f, -6.0f)
                lineTo(448.0f, 32.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(-190.0f, 0.0f)
                curveToRelative(21.7f, 11.2f, 40.2f, 27.8f, 53.7f, 48.0f)
                lineToRelative(136.2f, 0.0f)
                lineToRelative(0.0f, 208.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(64.0f, 480.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                close()
                moveTo(256.0f, 192.0f)
                arcToRelative(96.1f, 96.1f, 0.0f, true, false, 0.0f, 192.1f)
                arcToRelative(96.1f, 96.1f, 0.0f, true, false, 0.0f, -192.1f)
                close()
            }
        }
        .build()
        return _cameraRetro!!
    }

private var _cameraRetro: ImageVector? = null
