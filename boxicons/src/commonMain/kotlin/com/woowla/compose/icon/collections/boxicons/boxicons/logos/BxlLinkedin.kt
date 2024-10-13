package com.woowla.compose.icon.collections.boxicons.boxicons.logos

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
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlLinkedin: ImageVector
    get() {
        if (_bxlLinkedin != null) {
            return _bxlLinkedin!!
        }
        _bxlLinkedin = Builder(name = "BxlLinkedin", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.983f, 5.009f)
                moveToRelative(-2.188f, 0.0f)
                arcToRelative(2.188f, 2.188f, 0.0f, true, true, 4.376f, 0.0f)
                arcToRelative(2.188f, 2.188f, 0.0f, true, true, -4.376f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.237f, 8.855f)
                verticalLineToRelative(12.139f)
                horizontalLineToRelative(3.769f)
                verticalLineToRelative(-6.003f)
                curveToRelative(0.0f, -1.584f, 0.298f, -3.118f, 2.262f, -3.118f)
                curveToRelative(1.937f, 0.0f, 1.961f, 1.811f, 1.961f, 3.218f)
                verticalLineToRelative(5.904f)
                lineTo(21.0f, 20.995f)
                verticalLineToRelative(-6.657f)
                curveToRelative(0.0f, -3.27f, -0.704f, -5.783f, -4.526f, -5.783f)
                curveToRelative(-1.835f, 0.0f, -3.065f, 1.007f, -3.568f, 1.96f)
                horizontalLineToRelative(-0.051f)
                verticalLineToRelative(-1.66f)
                lineTo(9.237f, 8.855f)
                close()
                moveTo(3.095f, 8.855f)
                lineTo(6.87f, 8.855f)
                verticalLineToRelative(12.139f)
                lineTo(3.095f, 20.994f)
                close()
            }
        }
        .build()
        return _bxlLinkedin!!
    }

private var _bxlLinkedin: ImageVector? = null
