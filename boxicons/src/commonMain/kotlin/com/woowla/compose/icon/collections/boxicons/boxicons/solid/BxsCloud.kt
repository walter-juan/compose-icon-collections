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

public val SolidGroup.BxsCloud: ImageVector
    get() {
        if (_bxsCloud != null) {
            return _bxsCloud!!
        }
        _bxsCloud = Builder(name = "BxsCloud", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.944f, 11.112f)
                curveTo(18.507f, 7.67f, 15.56f, 5.0f, 12.0f, 5.0f)
                curveTo(9.244f, 5.0f, 6.85f, 6.611f, 5.757f, 9.15f)
                curveTo(3.609f, 9.792f, 2.0f, 11.82f, 2.0f, 14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(11.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                arcToRelative(4.01f, 4.01f, 0.0f, false, false, -3.056f, -3.888f)
                close()
            }
        }
        .build()
        return _bxsCloud!!
    }

private var _bxsCloud: ImageVector? = null
