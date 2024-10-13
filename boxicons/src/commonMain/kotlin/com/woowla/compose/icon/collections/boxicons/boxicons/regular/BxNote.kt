package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxNote: ImageVector
    get() {
        if (_bxNote != null) {
            return _bxNote!!
        }
        _bxNote = Builder(name = "BxNote", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(0.996f, 0.996f, 0.0f, false, false, 0.707f, -0.293f)
                lineToRelative(7.0f, -7.0f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, false, 0.196f, -0.293f)
                curveToRelative(0.014f, -0.03f, 0.022f, -0.061f, 0.033f, -0.093f)
                arcToRelative(0.991f, 0.991f, 0.0f, false, false, 0.051f, -0.259f)
                curveToRelative(0.002f, -0.021f, 0.013f, -0.041f, 0.013f, -0.062f)
                lineTo(21.0f, 5.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                lineTo(5.0f, 19.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(14.0f, 17.586f)
                lineTo(14.0f, 14.0f)
                horizontalLineToRelative(3.586f)
                lineTo(14.0f, 17.586f)
                close()
            }
        }
        .build()
        return _bxNote!!
    }

private var _bxNote: ImageVector? = null
