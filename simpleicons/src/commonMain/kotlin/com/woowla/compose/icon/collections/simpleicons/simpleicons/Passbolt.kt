package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Passbolt: ImageVector
    get() {
        if (_passbolt != null) {
            return _passbolt!!
        }
        _passbolt = Builder(name = "Passbolt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.393f, 9.736f)
                arcToRelative(2.691f, 2.691f, 0.0f, false, true, 1.145f, -0.274f)
                horizontalLineToRelative(0.001f)
                curveToRelative(1.391f, 0.0f, 2.538f, 1.153f, 2.483f, 2.525f)
                arcToRelative(2.51f, 2.51f, 0.0f, false, true, -2.51f, 2.524f)
                curveToRelative(-0.438f, 0.0f, -0.847f, -0.11f, -1.202f, -0.302f)
                arcTo(2.519f, 2.519f, 0.0f, false, true, 0.0f, 11.987f)
                curveToRelative(0.0f, -0.988f, 0.572f, -1.84f, 1.393f, -2.25f)
                close()
                moveTo(13.533f, 1.174f)
                lineTo(23.303f, 10.367f)
                horizontalLineToRelative(0.001f)
                curveToRelative(0.928f, 0.907f, 0.928f, 2.387f, 0.0f, 3.266f)
                lineToRelative(-9.74f, 9.193f)
                curveToRelative(-0.875f, 0.795f, -2.211f, 0.795f, -3.058f, 0.0f)
                lineToRelative(-6.167f, -5.79f)
                curveToRelative(1.638f, -0.577f, 2.894f, -1.949f, 3.358f, -3.65f)
                horizontalLineToRelative(3.682f)
                verticalLineToRelative(1.782f)
                curveToRelative(0.0f, 0.411f, 0.326f, 0.768f, 0.764f, 0.768f)
                horizontalLineToRelative(2.1f)
                curveToRelative(0.41f, 0.0f, 0.764f, -0.329f, 0.764f, -0.768f)
                verticalLineToRelative(-1.783f)
                horizontalLineToRelative(0.955f)
                curveToRelative(0.41f, 0.0f, 0.764f, -0.328f, 0.764f, -0.768f)
                verticalLineToRelative(-1.263f)
                arcToRelative(0.764f, 0.764f, 0.0f, false, false, -0.764f, -0.767f)
                lineTo(7.667f, 10.587f)
                arcToRelative(5.444f, 5.444f, 0.0f, false, false, -3.33f, -3.623f)
                lineToRelative(6.14f, -5.79f)
                curveToRelative(0.874f, -0.795f, 2.21f, -0.795f, 3.057f, 0.0f)
                close()
            }
        }
        .build()
        return _passbolt!!
    }

private var _passbolt: ImageVector? = null
