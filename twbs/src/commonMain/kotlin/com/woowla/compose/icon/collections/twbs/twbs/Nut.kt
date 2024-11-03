package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Nut: ImageVector
    get() {
        if (_nut != null) {
            return _nut!!
        }
        _nut = Builder(name = "Nut", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth
                = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.42f, 2.0f)
                lineToRelative(3.428f, 6.0f)
                lineToRelative(-3.428f, 6.0f)
                horizontalLineTo(4.58f)
                lineTo(1.152f, 8.0f)
                lineTo(4.58f, 2.0f)
                close()
                moveTo(4.58f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.868f, 0.504f)
                lineToRelative(-3.428f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 0.992f)
                lineToRelative(3.428f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.58f, 15.0f)
                horizontalLineToRelative(6.84f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.868f, -0.504f)
                lineToRelative(3.429f, -6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -0.992f)
                lineToRelative(-3.429f, -6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.42f, 1.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.848f, 5.933f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 2.5f, 4.33f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, -4.33f)
                moveToRelative(-1.78f, 3.915f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 6.061f, -3.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -6.062f, 3.5f)
                close()
            }
        }
        .build()
        return _nut!!
    }

private var _nut: ImageVector? = null
