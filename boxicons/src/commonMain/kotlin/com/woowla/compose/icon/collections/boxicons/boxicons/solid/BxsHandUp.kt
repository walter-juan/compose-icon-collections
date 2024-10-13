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

public val SolidGroup.BxsHandUp: ImageVector
    get() {
        if (_bxsHandUp != null) {
            return _bxsHandUp!!
        }
        _bxsHandUp = Builder(name = "BxsHandUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.221f, 10.803f)
                lineTo(12.0f, 10.0f)
                verticalLineTo(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -4.0f, 0.0f)
                verticalLineToRelative(12.0f)
                lineToRelative(-3.031f, -1.212f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.64f, 1.225f)
                lineToRelative(-0.113f, 0.34f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, false, 0.309f, 1.084f)
                lineToRelative(5.197f, 4.332f)
                curveToRelative(0.179f, 0.149f, 0.406f, 0.231f, 0.64f, 0.231f)
                horizontalLineTo(19.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineToRelative(-7.21f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.779f, -1.987f)
                close()
            }
        }
        .build()
        return _bxsHandUp!!
    }

private var _bxsHandUp: ImageVector? = null
