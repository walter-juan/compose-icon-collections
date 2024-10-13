package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsCapsule: ImageVector
    get() {
        if (_bxsCapsule != null) {
            return _bxsCapsule!!
        }
        _bxsCapsule = Builder(name = "BxsCapsule", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.434f, 20.566f)
                curveToRelative(1.335f, 0.0f, 2.591f, -0.52f, 3.535f, -1.464f)
                lineToRelative(7.134f, -7.133f)
                arcToRelative(5.008f, 5.008f, 0.0f, false, false, -0.001f, -7.072f)
                arcToRelative(4.969f, 4.969f, 0.0f, false, false, -3.536f, -1.463f)
                curveToRelative(-1.335f, 0.0f, -2.59f, 0.52f, -3.534f, 1.464f)
                lineToRelative(-7.134f, 7.133f)
                arcToRelative(5.01f, 5.01f, 0.0f, false, false, -0.001f, 7.072f)
                arcToRelative(4.971f, 4.971f, 0.0f, false, false, 3.537f, 1.463f)
                close()
                moveTo(13.445f, 6.312f)
                arcToRelative(2.979f, 2.979f, 0.0f, false, true, 2.12f, -0.878f)
                curveToRelative(0.802f, 0.0f, 1.556f, 0.312f, 2.122f, 0.878f)
                arcToRelative(3.004f, 3.004f, 0.0f, false, true, 0.001f, 4.243f)
                lineToRelative(-2.893f, 2.892f)
                lineToRelative(-4.242f, -4.244f)
                lineToRelative(2.892f, -2.891f)
                close()
            }
        }
        .build()
        return _bxsCapsule!!
    }

private var _bxsCapsule: ImageVector? = null
