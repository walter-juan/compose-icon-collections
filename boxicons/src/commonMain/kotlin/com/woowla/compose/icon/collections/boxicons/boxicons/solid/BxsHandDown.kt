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

public val SolidGroup.BxsHandDown: ImageVector
    get() {
        if (_bxsHandDown != null) {
            return _bxsHandDown!!
        }
        _bxsHandDown = Builder(name = "BxsHandDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.278f, 2.231f)
                arcToRelative(1.001f, 1.001f, 0.0f, false, false, -0.64f, -0.231f)
                horizontalLineTo(5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(7.21f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.779f, 1.987f)
                lineTo(12.0f, 14.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                verticalLineTo(8.0f)
                lineToRelative(3.03f, 1.212f)
                arcToRelative(2.001f, 2.001f, 0.0f, false, false, 2.641f, -1.225f)
                lineToRelative(0.113f, -0.34f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, false, -0.309f, -1.084f)
                lineToRelative(-5.197f, -4.332f)
                close()
            }
        }
        .build()
        return _bxsHandDown!!
    }

private var _bxsHandDown: ImageVector? = null
