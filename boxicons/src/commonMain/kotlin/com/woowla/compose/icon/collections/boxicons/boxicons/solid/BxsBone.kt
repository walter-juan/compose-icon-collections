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

public val SolidGroup.BxsBone: ImageVector
    get() {
        if (_bxsBone != null) {
            return _bxsBone!!
        }
        _bxsBone = Builder(name = "BxsBone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.852f, 5.148f)
                arcToRelative(3.317f, 3.317f, 0.0f, false, false, -0.96f, -2.183f)
                arcToRelative(3.333f, 3.333f, 0.0f, true, false, -4.713f, 4.714f)
                lineToRelative(-5.499f, 5.5f)
                arcToRelative(3.333f, 3.333f, 0.0f, true, false, -4.714f, 4.713f)
                curveToRelative(0.606f, 0.606f, 1.39f, 0.918f, 2.183f, 0.96f)
                curveToRelative(0.042f, 0.793f, 0.354f, 1.576f, 0.96f, 2.183f)
                arcToRelative(3.333f, 3.333f, 0.0f, true, false, 4.713f, -4.714f)
                lineToRelative(5.499f, -5.499f)
                arcToRelative(3.333f, 3.333f, 0.0f, true, false, 4.714f, -4.713f)
                arcToRelative(3.313f, 3.313f, 0.0f, false, false, -2.183f, -0.961f)
                close()
            }
        }
        .build()
        return _bxsBone!!
    }

private var _bxsBone: ImageVector? = null
