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

public val SolidGroup.BxsHandRight: ImageVector
    get() {
        if (_bxsHandRight != null) {
            return _bxsHandRight!!
        }
        _bxsHandRight = Builder(name = "BxsHandRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 8.0f)
                horizontalLineTo(8.0f)
                lineToRelative(1.212f, -3.03f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.225f, -2.641f)
                lineToRelative(-0.34f, -0.113f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, false, -1.084f, 0.309f)
                lineTo(2.231f, 7.722f)
                arcToRelative(1.001f, 1.001f, 0.0f, false, false, -0.231f, 0.64f)
                verticalLineTo(19.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(7.21f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.987f, -1.779f)
                lineTo(14.0f, 12.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                close()
            }
        }
        .build()
        return _bxsHandRight!!
    }

private var _bxsHandRight: ImageVector? = null
