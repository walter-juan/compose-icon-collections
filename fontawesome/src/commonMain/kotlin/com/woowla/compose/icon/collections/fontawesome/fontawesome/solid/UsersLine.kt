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

public val SolidGroup.UsersLine: ImageVector
    get() {
        if (_usersLine != null) {
            return _usersLine!!
        }
        _usersLine = Builder(name = "UsersLine", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 128.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 128.0f, 0.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, -128.0f, 0.0f)
                close()
                moveTo(176.0f, 336.0f)
                curveToRelative(0.0f, -61.9f, 50.1f, -112.0f, 112.0f, -112.0f)
                reflectiveCurveToRelative(112.0f, 50.1f, 112.0f, 112.0f)
                lineToRelative(0.0f, 8.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                lineToRelative(-176.0f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                lineToRelative(0.0f, -8.0f)
                close()
                moveTo(392.0f, 144.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 112.0f, 0.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, -112.0f, 0.0f)
                close()
                moveTo(419.2f, 244.4f)
                curveToRelative(9.1f, -2.9f, 18.8f, -4.4f, 28.8f, -4.4f)
                curveToRelative(53.0f, 0.0f, 96.0f, 43.0f, 96.0f, 96.0f)
                lineToRelative(0.0f, 10.7f)
                curveToRelative(0.0f, 11.8f, -9.6f, 21.3f, -21.3f, 21.3f)
                lineToRelative(-78.8f, 0.0f)
                curveToRelative(2.7f, -7.5f, 4.1f, -15.6f, 4.1f, -24.0f)
                lineToRelative(0.0f, -8.0f)
                curveToRelative(0.0f, -34.1f, -10.6f, -65.7f, -28.8f, -91.6f)
                close()
                moveTo(156.8f, 244.4f)
                curveToRelative(-18.2f, 26.0f, -28.8f, 57.5f, -28.8f, 91.6f)
                lineToRelative(0.0f, 8.0f)
                curveToRelative(0.0f, 8.4f, 1.4f, 16.5f, 4.1f, 24.0f)
                lineToRelative(-78.8f, 0.0f)
                curveTo(41.6f, 368.0f, 32.0f, 358.4f, 32.0f, 346.7f)
                lineTo(32.0f, 336.0f)
                curveToRelative(0.0f, -53.0f, 43.0f, -96.0f, 96.0f, -96.0f)
                curveToRelative(10.0f, 0.0f, 19.7f, 1.5f, 28.8f, 4.4f)
                close()
                moveTo(72.0f, 144.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 112.0f, 0.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, -112.0f, 0.0f)
                close()
                moveTo(0.0f, 440.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                lineToRelative(528.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                lineTo(24.0f, 464.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                close()
            }
        }
        .build()
        return _usersLine!!
    }

private var _usersLine: ImageVector? = null
