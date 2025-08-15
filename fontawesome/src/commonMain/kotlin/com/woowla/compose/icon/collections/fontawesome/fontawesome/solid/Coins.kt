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

public val SolidGroup.Coins: ImageVector
    get() {
        if (_coins != null) {
            return _coins!!
        }
        _coins = Builder(name = "Coins", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 96.0f)
                lineToRelative(0.0f, -16.0f)
                curveToRelative(0.0f, -44.2f, 86.0f, -80.0f, 192.0f, -80.0f)
                reflectiveCurveTo(512.0f, 35.8f, 512.0f, 80.0f)
                lineToRelative(0.0f, 16.0f)
                curveToRelative(0.0f, 30.6f, -41.3f, 57.2f, -102.0f, 70.7f)
                curveToRelative(-2.4f, -2.8f, -4.9f, -5.5f, -7.4f, -8.0f)
                curveToRelative(-15.5f, -15.3f, -35.5f, -26.9f, -56.4f, -35.5f)
                curveToRelative(-41.9f, -17.5f, -96.5f, -27.1f, -154.2f, -27.1f)
                curveToRelative(-21.9f, 0.0f, -43.3f, 1.4f, -63.8f, 4.1f)
                curveToRelative(-0.2f, -1.3f, -0.2f, -2.7f, -0.2f, -4.1f)
                close()
                moveTo(432.0f, 353.0f)
                lineToRelative(0.0f, -46.2f)
                curveToRelative(15.1f, -3.9f, 29.3f, -8.5f, 42.2f, -13.9f)
                curveToRelative(13.2f, -5.5f, 26.1f, -12.2f, 37.8f, -20.3f)
                lineToRelative(0.0f, 15.4f)
                curveToRelative(0.0f, 26.8f, -31.5f, 50.5f, -80.0f, 65.0f)
                close()
                moveTo(432.0f, 257.0f)
                lineToRelative(0.0f, -33.0f)
                curveToRelative(0.0f, -4.5f, -0.4f, -8.8f, -1.0f, -13.0f)
                curveToRelative(15.5f, -3.9f, 30.0f, -8.6f, 43.2f, -14.2f)
                reflectiveCurveToRelative(26.1f, -12.2f, 37.8f, -20.3f)
                lineToRelative(0.0f, 15.4f)
                curveToRelative(0.0f, 26.8f, -31.5f, 50.5f, -80.0f, 65.0f)
                close()
                moveTo(0.0f, 240.0f)
                lineToRelative(0.0f, -16.0f)
                curveToRelative(0.0f, -44.2f, 86.0f, -80.0f, 192.0f, -80.0f)
                reflectiveCurveToRelative(192.0f, 35.8f, 192.0f, 80.0f)
                lineToRelative(0.0f, 16.0f)
                curveToRelative(0.0f, 44.2f, -86.0f, 80.0f, -192.0f, 80.0f)
                reflectiveCurveTo(0.0f, 284.2f, 0.0f, 240.0f)
                close()
                moveTo(384.0f, 336.0f)
                curveToRelative(0.0f, 44.2f, -86.0f, 80.0f, -192.0f, 80.0f)
                reflectiveCurveTo(0.0f, 380.2f, 0.0f, 336.0f)
                lineToRelative(0.0f, -15.4f)
                curveToRelative(11.6f, 8.1f, 24.5f, 14.7f, 37.8f, 20.3f)
                curveToRelative(41.9f, 17.5f, 96.5f, 27.1f, 154.2f, 27.1f)
                reflectiveCurveToRelative(112.3f, -9.7f, 154.2f, -27.1f)
                curveToRelative(13.2f, -5.5f, 26.1f, -12.2f, 37.8f, -20.3f)
                lineToRelative(0.0f, 15.4f)
                close()
                moveTo(384.0f, 416.6f)
                lineToRelative(0.0f, 15.4f)
                curveToRelative(0.0f, 44.2f, -86.0f, 80.0f, -192.0f, 80.0f)
                reflectiveCurveTo(0.0f, 476.2f, 0.0f, 432.0f)
                lineToRelative(0.0f, -15.4f)
                curveToRelative(11.6f, 8.1f, 24.5f, 14.7f, 37.8f, 20.3f)
                curveToRelative(41.9f, 17.5f, 96.5f, 27.1f, 154.2f, 27.1f)
                reflectiveCurveToRelative(112.3f, -9.7f, 154.2f, -27.1f)
                curveToRelative(13.2f, -5.5f, 26.1f, -12.2f, 37.8f, -20.3f)
                close()
            }
        }
        .build()
        return _coins!!
    }

private var _coins: ImageVector? = null
