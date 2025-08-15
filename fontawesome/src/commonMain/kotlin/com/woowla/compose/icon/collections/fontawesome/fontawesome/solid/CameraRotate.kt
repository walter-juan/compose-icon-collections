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

public val SolidGroup.CameraRotate: ImageVector
    get() {
        if (_cameraRotate != null) {
            return _cameraRotate!!
        }
        _cameraRotate = Builder(name = "CameraRotate", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(138.7f, 96.0f)
                lineToRelative(10.4f, -31.2f)
                curveTo(155.6f, 45.2f, 173.9f, 32.0f, 194.6f, 32.0f)
                lineToRelative(122.8f, 0.0f)
                curveToRelative(20.7f, 0.0f, 39.0f, 13.2f, 45.5f, 32.8f)
                lineTo(373.3f, 96.0f)
                lineTo(448.0f, 96.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineToRelative(0.0f, 256.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(64.0f, 480.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(0.0f, 160.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                lineToRelative(74.7f, 0.0f)
                close()
                moveTo(96.0f, 305.9f)
                curveToRelative(0.0f, 3.9f, 1.4f, 7.7f, 4.0f, 10.6f)
                lineToRelative(48.0f, 54.0f)
                curveToRelative(6.4f, 7.2f, 17.6f, 7.2f, 23.9f, 0.0f)
                lineToRelative(48.0f, -54.0f)
                curveToRelative(2.6f, -2.9f, 4.0f, -6.7f, 4.0f, -10.6f)
                lineToRelative(0.0f, -1.9f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                lineToRelative(-24.0f, 0.0f)
                curveToRelative(0.0f, -39.8f, 32.2f, -72.0f, 72.0f, -72.0f)
                curveToRelative(4.4f, 0.0f, 8.7f, 0.4f, 12.9f, 1.2f)
                lineToRelative(34.9f, -39.3f)
                curveToRelative(-14.6f, -6.4f, -30.8f, -9.9f, -47.8f, -9.9f)
                curveToRelative(-66.3f, 0.0f, -120.0f, 53.7f, -120.0f, 120.0f)
                lineToRelative(-24.0f, 0.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                lineToRelative(0.0f, 1.9f)
                close()
                moveTo(292.0f, 259.4f)
                curveToRelative(-2.6f, 2.9f, -4.0f, 6.7f, -4.0f, 10.6f)
                lineToRelative(0.0f, 1.9f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                lineToRelative(24.0f, 0.0f)
                curveToRelative(0.0f, 39.8f, -32.2f, 72.0f, -72.0f, 72.0f)
                curveToRelative(-4.4f, 0.0f, -8.7f, -0.4f, -12.9f, -1.2f)
                lineToRelative(-34.9f, 39.3f)
                curveToRelative(14.7f, 6.4f, 30.8f, 9.9f, 47.8f, 9.9f)
                curveToRelative(66.3f, 0.0f, 120.0f, -53.7f, 120.0f, -120.0f)
                lineToRelative(24.0f, 0.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                lineToRelative(0.0f, -1.9f)
                curveToRelative(0.0f, -3.9f, -1.4f, -7.7f, -4.0f, -10.6f)
                lineToRelative(-48.0f, -54.0f)
                curveToRelative(-6.4f, -7.2f, -17.6f, -7.2f, -23.9f, 0.0f)
                lineToRelative(-48.0f, 54.0f)
                close()
            }
        }
        .build()
        return _cameraRotate!!
    }

private var _cameraRotate: ImageVector? = null
