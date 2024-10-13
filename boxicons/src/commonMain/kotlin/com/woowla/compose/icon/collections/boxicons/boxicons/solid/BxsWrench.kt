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

public val SolidGroup.BxsWrench: ImageVector
    get() {
        if (_bxsWrench != null) {
            return _bxsWrench!!
        }
        _bxsWrench = Builder(name = "BxsWrench", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.512f, 6.112f)
                lineToRelative(-3.89f, 3.889f)
                lineToRelative(-3.535f, -3.536f)
                lineToRelative(3.889f, -3.889f)
                arcToRelative(6.501f, 6.501f, 0.0f, false, false, -8.484f, 8.486f)
                lineToRelative(-6.276f, 6.275f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, 0.0f, 1.414f)
                lineToRelative(2.122f, 2.122f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, 1.414f, 0.0f)
                lineToRelative(6.275f, -6.276f)
                arcToRelative(6.501f, 6.501f, 0.0f, false, false, 7.071f, -1.414f)
                arcToRelative(6.504f, 6.504f, 0.0f, false, false, 1.414f, -7.071f)
                close()
            }
        }
        .build()
        return _bxsWrench!!
    }

private var _bxsWrench: ImageVector? = null
