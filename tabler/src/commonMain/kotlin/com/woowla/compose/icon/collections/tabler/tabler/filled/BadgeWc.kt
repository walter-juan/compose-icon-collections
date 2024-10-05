package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.BadgeWc: ImageVector
    get() {
        if (_badgeWc != null) {
            return _badgeWc!!
        }
        _badgeWc = Builder(name = "BadgeWc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineToRelative(-14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineToRelative(-10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                close()
                moveTo(11.466f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.963f, 0.917f)
                lineToRelative(-0.204f, 2.445f)
                lineToRelative(-0.405f, -0.81f)
                lineToRelative(-0.063f, -0.11f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.725f, 0.11f)
                lineToRelative(-0.406f, 0.81f)
                lineToRelative(-0.203f, -2.445f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.963f, -0.917f)
                lineToRelative(-0.117f, 0.003f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.914f, 1.08f)
                lineToRelative(0.5f, 6.0f)
                lineToRelative(0.016f, 0.117f)
                curveToRelative(0.175f, 0.91f, 1.441f, 1.115f, 1.875f, 0.247f)
                lineToRelative(1.106f, -2.211f)
                lineToRelative(1.106f, 2.211f)
                curveToRelative(0.452f, 0.904f, 1.807f, 0.643f, 1.89f, -0.364f)
                lineToRelative(0.5f, -6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.913f, -1.08f)
                close()
                moveTo(15.5f, 8.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, 2.5f)
                verticalLineToRelative(3.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 5.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -1.0f, 0.0f)
                verticalLineToRelative(-3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, -2.5f)
            }
        }
        .build()
        return _badgeWc!!
    }

private var _badgeWc: ImageVector? = null
