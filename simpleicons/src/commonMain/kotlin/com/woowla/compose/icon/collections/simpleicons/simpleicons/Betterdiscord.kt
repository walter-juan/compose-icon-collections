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

public val Simpleicons.Betterdiscord: ImageVector
    get() {
        if (_betterdiscord != null) {
            return _betterdiscord!!
        }
        _betterdiscord = Builder(name = "Betterdiscord", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.393f, 0.861f)
                quadToRelative(0.514f, 0.258f, 0.964f, 0.57f)
                arcToRelative(6.6f, 6.6f, 0.0f, false, true, 2.122f, 2.387f)
                curveToRelative(0.513f, 0.987f, 0.792f, 2.133f, 0.828f, 3.409f)
                verticalLineToRelative(9.556f)
                curveToRelative(-0.035f, 1.275f, -0.313f, 2.422f, -0.828f, 3.408f)
                arcToRelative(6.6f, 6.6f, 0.0f, false, true, -2.122f, 2.387f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.933f, 0.555f)
                horizontalLineToRelative(0.933f)
                curveToRelative(4.46f, 0.024f, 8.643f, -2.205f, 8.643f, -7.315f)
                verticalLineTo(8.352f)
                curveToRelative(0.024f, -5.21f, -4.16f, -7.49f, -8.62f, -7.49f)
                close()
                moveTo(0.0f, 0.867f)
                verticalLineToRelative(9.197f)
                lineToRelative(5.693f, 5.127f)
                verticalLineTo(5.44f)
                horizontalLineToRelative(3.31f)
                curveToRelative(3.537f, 0.0f, 3.537f, 4.444f, 0.0f, 4.444f)
                horizontalLineTo(6.817f)
                verticalLineToRelative(4.244f)
                horizontalLineToRelative(2.188f)
                curveToRelative(3.536f, 0.0f, 3.536f, 4.441f, 0.0f, 4.441f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(4.57f)
                horizontalLineToRelative(8.904f)
                curveToRelative(4.59f, 0.0f, 8.151f, -1.836f, 8.278f, -6.388f)
                curveToRelative(0.0f, -2.094f, -0.574f, -3.66f, -1.584f, -4.748f)
                curveToRelative(1.01f, -1.087f, 1.584f, -2.652f, 1.584f, -4.746f)
                curveToRelative(-0.125f, -4.553f, -3.687f, -6.39f, -8.278f, -6.39f)
                close()
            }
        }
        .build()
        return _betterdiscord!!
    }

private var _betterdiscord: ImageVector? = null
