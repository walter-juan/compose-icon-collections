package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlLinkedinSquare: ImageVector
    get() {
        if (_bxlLinkedinSquare != null) {
            return _bxlLinkedinSquare!!
        }
        _bxlLinkedinSquare = Builder(name = "BxlLinkedinSquare", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 3.0f)
                lineTo(4.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(21.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(8.339f, 18.337f)
                lineTo(5.667f, 18.337f)
                verticalLineToRelative(-8.59f)
                horizontalLineToRelative(2.672f)
                verticalLineToRelative(8.59f)
                close()
                moveTo(7.003f, 8.574f)
                arcToRelative(1.548f, 1.548f, 0.0f, true, true, 0.0f, -3.096f)
                arcToRelative(1.548f, 1.548f, 0.0f, false, true, 0.0f, 3.096f)
                close()
                moveTo(18.338f, 18.337f)
                horizontalLineToRelative(-2.669f)
                lineTo(15.669f, 14.16f)
                curveToRelative(0.0f, -0.996f, -0.018f, -2.277f, -1.388f, -2.277f)
                curveToRelative(-1.39f, 0.0f, -1.601f, 1.086f, -1.601f, 2.207f)
                verticalLineToRelative(4.248f)
                horizontalLineToRelative(-2.667f)
                verticalLineToRelative(-8.59f)
                horizontalLineToRelative(2.56f)
                verticalLineToRelative(1.174f)
                horizontalLineToRelative(0.037f)
                curveToRelative(0.355f, -0.675f, 1.227f, -1.387f, 2.524f, -1.387f)
                curveToRelative(2.704f, 0.0f, 3.203f, 1.778f, 3.203f, 4.092f)
                verticalLineToRelative(4.71f)
                close()
            }
        }
        .build()
        return _bxlLinkedinSquare!!
    }

private var _bxlLinkedinSquare: ImageVector? = null
