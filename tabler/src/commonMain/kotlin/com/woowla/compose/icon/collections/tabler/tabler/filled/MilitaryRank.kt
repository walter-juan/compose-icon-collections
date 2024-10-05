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

public val FilledGroup.MilitaryRank: ImageVector
    get() {
        if (_militaryRank != null) {
            return _militaryRank!!
        }
        _militaryRank = Builder(name = "MilitaryRank", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.555f, 2.168f)
                lineToRelative(6.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.445f, 0.832f)
                verticalLineToRelative(12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineToRelative(-12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.445f, -0.832f)
                lineToRelative(6.0f, -4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.11f, 0.0f)
                moveToRelative(-0.108f, 12.938f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.894f, 0.0f)
                lineToRelative(-2.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.447f, 1.341f)
                lineToRelative(0.058f, 0.102f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.283f, 0.345f)
                lineToRelative(1.553f, -0.776f)
                lineToRelative(1.553f, 0.776f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.894f, -1.788f)
                close()
                moveTo(12.447f, 11.106f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.894f, 0.0f)
                lineToRelative(-2.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.447f, 1.341f)
                lineToRelative(0.058f, 0.102f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.283f, 0.345f)
                lineToRelative(1.553f, -0.776f)
                lineToRelative(1.553f, 0.776f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.894f, -1.788f)
                close()
                moveTo(12.447f, 7.106f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.894f, 0.0f)
                lineToRelative(-2.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.447f, 1.341f)
                lineToRelative(0.058f, 0.102f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.283f, 0.345f)
                lineToRelative(1.553f, -0.776f)
                lineToRelative(1.553f, 0.776f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.894f, -1.788f)
                close()
            }
        }
        .build()
        return _militaryRank!!
    }

private var _militaryRank: ImageVector? = null
