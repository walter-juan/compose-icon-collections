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

public val SolidGroup.BxsEraser: ImageVector
    get() {
        if (_bxsEraser != null) {
            return _bxsEraser!!
        }
        _bxsEraser = Builder(name = "BxsEraser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.48f, 3.0f)
                lineTo(7.73f, 7.75f)
                lineTo(3.0f, 12.59f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 2.82f)
                lineToRelative(4.3f, 4.3f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 20.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-7.0f)
                lineToRelative(7.22f, -7.22f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -2.83f)
                lineTo(15.31f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.83f, 0.0f)
                close()
                moveTo(8.41f, 18.0f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(4.75f, -4.84f)
                lineToRelative(0.74f, -0.75f)
                lineToRelative(4.95f, 4.95f)
                lineToRelative(-4.56f, 4.56f)
                lineToRelative(-0.07f, 0.08f)
                close()
            }
        }
        .build()
        return _bxsEraser!!
    }

private var _bxsEraser: ImageVector? = null
