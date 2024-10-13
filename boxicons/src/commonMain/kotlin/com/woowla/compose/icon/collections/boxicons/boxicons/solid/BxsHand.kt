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

public val SolidGroup.BxsHand: ImageVector
    get() {
        if (_bxsHand != null) {
            return _bxsHand!!
        }
        _bxsHand = Builder(name = "BxsHand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 19.0f, 6.5f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(4.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(3.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(5.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(10.81f)
                lineToRelative(-2.22f, -3.6f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.56f, 1.58f)
                lineToRelative(3.31f, 5.34f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 9.78f, 22.0f)
                horizontalLineTo(17.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 5.0f, -5.0f)
                verticalLineTo(6.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 20.5f, 5.0f)
                close()
            }
        }
        .build()
        return _bxsHand!!
    }

private var _bxsHand: ImageVector? = null
