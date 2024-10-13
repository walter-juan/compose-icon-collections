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

public val RegularGroup.BxRightDownArrowCircle: ImageVector
    get() {
        if (_bxRightDownArrowCircle != null) {
            return _bxRightDownArrowCircle!!
        }
        _bxRightDownArrowCircle = Builder(name = "BxRightDownArrowCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.007f)
                arcToRelative(9.928f, 9.928f, 0.0f, false, false, -7.071f, 2.922f)
                curveToRelative(-3.899f, 3.899f, -3.899f, 10.243f, 0.0f, 14.143f)
                arcTo(9.93f, 9.93f, 0.0f, false, false, 12.0f, 21.995f)
                arcToRelative(9.93f, 9.93f, 0.0f, false, false, 7.071f, -2.923f)
                curveToRelative(3.899f, -3.899f, 3.899f, -10.243f, 0.0f, -14.143f)
                arcTo(9.928f, 9.928f, 0.0f, false, false, 12.0f, 2.007f)
                close()
                moveTo(17.657f, 17.657f)
                arcTo(7.946f, 7.946f, 0.0f, false, true, 12.0f, 19.994f)
                curveToRelative(-2.141f, 0.0f, -4.15f, -0.83f, -5.657f, -2.337f)
                curveToRelative(-3.119f, -3.119f, -3.119f, -8.195f, 0.0f, -11.314f)
                arcTo(7.944f, 7.944f, 0.0f, false, true, 12.0f, 4.007f)
                curveToRelative(2.141f, 0.0f, 4.15f, 0.829f, 5.657f, 2.336f)
                curveToRelative(3.119f, 3.119f, 3.119f, 8.195f, 0.0f, 11.314f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.661f, 8.247f)
                lineTo(8.247f, 9.661f)
                lineToRelative(3.214f, 3.214f)
                lineTo(9.336f, 15.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(9.337f)
                lineToRelative(-2.125f, 2.124f)
                close()
            }
        }
        .build()
        return _bxRightDownArrowCircle!!
    }

private var _bxRightDownArrowCircle: ImageVector? = null
