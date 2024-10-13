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

public val SolidGroup.BxsLabel: ImageVector
    get() {
        if (_bxsLabel != null) {
            return _bxsLabel!!
        }
        _bxsLabel = Builder(name = "BxsLabel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.813f, 4.419f)
                arcTo(0.997f, 0.997f, 0.0f, false, false, 16.0f, 4.0f)
                horizontalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.813f, 1.581f)
                lineTo(6.771f, 12.0f)
                lineToRelative(-4.585f, 6.419f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 20.0f)
                horizontalLineToRelative(13.0f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, false, 0.813f, -0.419f)
                lineToRelative(5.0f, -7.0f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, false, 0.0f, -1.162f)
                lineToRelative(-5.0f, -7.0f)
                close()
            }
        }
        .build()
        return _bxsLabel!!
    }

private var _bxsLabel: ImageVector? = null
