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

public val SolidGroup.UsersRectangle: ImageVector
    get() {
        if (_usersRectangle != null) {
            return _usersRectangle!!
        }
        _usersRectangle = Builder(name = "UsersRectangle", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 32.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(448.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -320.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(64.0f, 32.0f)
                close()
                moveTo(288.0f, 104.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 0.0f, 112.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 0.0f, -112.0f)
                close()
                moveTo(288.0f, 256.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, 43.0f, 96.0f, 96.0f)
                lineToRelative(0.0f, 24.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                lineToRelative(-144.0f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                lineToRelative(0.0f, -24.0f)
                curveToRelative(0.0f, -53.0f, 43.0f, -96.0f, 96.0f, -96.0f)
                close()
                moveTo(384.0f, 192.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -96.0f, 0.0f)
                close()
                moveTo(168.0f, 272.3f)
                curveToRelative(-15.2f, 22.8f, -24.0f, 50.2f, -24.0f, 79.7f)
                lineToRelative(0.0f, 24.0f)
                curveToRelative(0.0f, 8.4f, 1.4f, 16.5f, 4.1f, 24.0f)
                lineToRelative(-46.8f, 0.0f)
                curveTo(89.6f, 400.0f, 80.0f, 390.4f, 80.0f, 378.7f)
                lineTo(80.0f, 368.0f)
                curveToRelative(0.0f, -50.3f, 38.7f, -91.6f, 88.0f, -95.7f)
                close()
                moveTo(427.9f, 400.0f)
                curveToRelative(2.7f, -7.5f, 4.1f, -15.6f, 4.1f, -24.0f)
                lineToRelative(0.0f, -24.0f)
                curveToRelative(0.0f, -29.5f, -8.8f, -56.9f, -24.0f, -79.7f)
                curveToRelative(49.3f, 4.1f, 88.0f, 45.3f, 88.0f, 95.7f)
                lineToRelative(0.0f, 10.7f)
                curveToRelative(0.0f, 11.8f, -9.6f, 21.3f, -21.3f, 21.3f)
                lineToRelative(-46.8f, 0.0f)
                close()
                moveTo(96.0f, 192.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -96.0f, 0.0f)
                close()
            }
        }
        .build()
        return _usersRectangle!!
    }

private var _usersRectangle: ImageVector? = null
