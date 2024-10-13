package com.woowla.compose.icon.collections.boxicons.boxicons.regular

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
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxCart: ImageVector
    get() {
        if (_bxCart != null) {
            return _bxCart!!
        }
        _bxCart = Builder(name = "BxCart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.822f, 7.431f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 7.0f)
                horizontalLineTo(7.333f)
                lineTo(6.179f, 4.23f)
                arcTo(1.994f, 1.994f, 0.0f, false, false, 4.333f, 3.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.333f)
                lineToRelative(4.744f, 11.385f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 17.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.417f, 0.0f, 0.79f, -0.259f, 0.937f, -0.648f)
                lineToRelative(3.0f, -8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.115f, -0.921f)
                close()
                moveTo(17.307f, 15.0f)
                horizontalLineToRelative(-6.64f)
                lineToRelative(-2.5f, -6.0f)
                horizontalLineToRelative(11.39f)
                lineToRelative(-2.25f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 19.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 19.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
        }
        .build()
        return _bxCart!!
    }

private var _bxCart: ImageVector? = null
