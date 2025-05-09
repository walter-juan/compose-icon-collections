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

public val RegularGroup.BxHomeHeart: ImageVector
    get() {
        if (_bxHomeHeart != null) {
            return _bxHomeHeart!!
        }
        _bxHomeHeart = Builder(name = "BxHomeHeart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.223f, 11.641f)
                lineToRelative(-0.223f, 0.22f)
                lineToRelative(-0.224f, -0.22f)
                arcToRelative(2.224f, 2.224f, 0.0f, false, false, -3.125f, 0.0f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, false, 0.0f, 3.07f)
                lineTo(12.0f, 18.0f)
                lineToRelative(3.349f, -3.289f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, false, 0.0f, -3.07f)
                arcToRelative(2.225f, 2.225f, 0.0f, false, false, -3.126f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.707f, 11.293f)
                lineToRelative(-9.0f, -9.0f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, -1.414f, 0.0f)
                lineToRelative(-9.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 13.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.707f, -1.707f)
                close()
                moveTo(18.001f, 20.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-9.585f)
                lineToRelative(6.0f, -6.0f)
                lineToRelative(6.0f, 6.0f)
                verticalLineTo(15.0f)
                lineToRelative(0.001f, 5.0f)
                close()
            }
        }
        .build()
        return _bxHomeHeart!!
    }

private var _bxHomeHeart: ImageVector? = null
