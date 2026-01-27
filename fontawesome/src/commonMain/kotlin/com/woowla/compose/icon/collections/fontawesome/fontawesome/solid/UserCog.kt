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

public val SolidGroup.UserCog: ImageVector
    get() {
        if (_userCog != null) {
            return _userCog!!
        }
        _userCog = Builder(name = "UserCog", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.5f, 8.0f)
                arcToRelative(120.0f, 120.0f, 0.0f, true, true, 0.0f, 240.0f)
                arcToRelative(120.0f, 120.0f, 0.0f, true, true, 0.0f, -240.0f)
                close()
                moveTo(226.7f, 304.0f)
                lineToRelative(59.4f, 0.0f)
                lineToRelative(1.5f, 0.0f)
                curveToRelative(-12.9f, 26.8f, -7.8f, 58.2f, 11.5f, 79.5f)
                curveToRelative(-20.2f, 22.3f, -24.8f, 55.8f, -9.4f, 83.4f)
                lineToRelative(22.5f, 40.4f)
                curveToRelative(0.9f, 1.6f, 1.9f, 3.2f, 2.9f, 4.7f)
                lineToRelative(-237.0f, 0.0f)
                curveToRelative(-16.4f, 0.0f, -29.7f, -13.3f, -29.7f, -29.7f)
                curveToRelative(0.0f, -98.5f, 79.8f, -178.3f, 178.3f, -178.3f)
                close()
                moveTo(432.6f, 247.6f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                lineToRelative(48.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                lineToRelative(0.0f, 6.1f)
                curveToRelative(0.0f, 18.9f, 24.1f, 32.8f, 40.5f, 23.4f)
                lineToRelative(5.0f, -2.9f)
                curveToRelative(11.6f, -6.7f, 26.5f, -2.6f, 33.0f, 9.1f)
                lineToRelative(22.4f, 40.2f)
                curveToRelative(6.2f, 11.2f, 2.6f, 25.2f, -8.2f, 32.0f)
                lineToRelative(-4.7f, 2.9f)
                curveToRelative(-16.2f, 10.1f, -16.2f, 39.9f, 0.0f, 50.1f)
                lineToRelative(4.6f, 2.9f)
                curveToRelative(10.8f, 6.8f, 14.5f, 20.8f, 8.3f, 32.0f)
                lineTo(607.0f, 483.8f)
                curveToRelative(-6.5f, 11.7f, -21.4f, 15.9f, -33.0f, 9.1f)
                lineToRelative(-4.9f, -2.9f)
                curveToRelative(-16.4f, -9.5f, -40.5f, 4.5f, -40.5f, 23.4f)
                lineToRelative(0.0f, 6.1f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                lineToRelative(-48.0f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                lineToRelative(0.0f, -5.9f)
                curveToRelative(0.0f, -19.0f, -24.2f, -33.0f, -40.7f, -23.5f)
                lineToRelative(-4.8f, 2.8f)
                curveToRelative(-11.6f, 6.7f, -26.4f, 2.6f, -33.0f, -9.1f)
                lineToRelative(-22.6f, -40.4f)
                curveToRelative(-6.2f, -11.2f, -2.6f, -25.3f, 8.3f, -32.1f)
                lineToRelative(4.4f, -2.7f)
                curveToRelative(16.3f, -10.1f, 16.3f, -40.1f, 0.0f, -50.2f)
                lineToRelative(-4.5f, -2.8f)
                curveToRelative(-10.9f, -6.8f, -14.5f, -20.9f, -8.3f, -32.1f)
                lineToRelative(22.5f, -40.3f)
                curveToRelative(6.5f, -11.7f, 21.4f, -15.8f, 32.9f, -9.1f)
                lineToRelative(4.8f, 2.8f)
                curveToRelative(16.5f, 9.5f, 40.7f, -4.5f, 40.7f, -23.5f)
                lineToRelative(0.0f, -5.9f)
                close()
                moveTo(532.5f, 383.8f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, false, -104.0f, 0.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, false, 104.0f, 0.0f)
                close()
            }
        }
        .build()
        return _userCog!!
    }

private var _userCog: ImageVector? = null
