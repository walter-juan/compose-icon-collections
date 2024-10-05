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

public val FilledGroup.BadgeVr: ImageVector
    get() {
        if (_badgeVr != null) {
            return _badgeVr!!
        }
        _badgeVr = Builder(name = "BadgeVr", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(15.5f, 8.0f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.883f, -0.993f)
                verticalLineToRelative(-1.196f)
                lineToRelative(1.168f, 1.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.387f, 0.278f)
                lineToRelative(0.093f, -0.07f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.184f, -1.317f)
                lineToRelative(-1.159f, -1.738f)
                lineToRelative(0.044f, -0.023f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -1.217f, -4.684f)
                moveToRelative(-4.184f, 0.051f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.265f, 0.633f)
                lineToRelative(-1.051f, 3.154f)
                lineToRelative(-1.051f, -3.154f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.898f, 0.632f)
                lineToRelative(2.0f, 6.0f)
                curveToRelative(0.304f, 0.912f, 1.594f, 0.912f, 1.898f, 0.0f)
                lineToRelative(2.0f, -6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.633f, -1.265f)
                moveToRelative(4.184f, 1.949f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, 1.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _badgeVr!!
    }

private var _badgeVr: ImageVector? = null
