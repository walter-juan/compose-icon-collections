package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.HCircle: ImageVector
    get() {
        if (_hCircle != null) {
            return _hCircle!!
        }
        _hCircle = Builder(name = "HCircle", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 8.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, 14.0f, 0.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 1.0f, 8.0f)
                moveToRelative(15.0f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                moveToRelative(-5.0f, -3.998f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.67f)
                verticalLineTo(8.455f)
                horizontalLineTo(6.33f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.002f)
                horizontalLineToRelative(1.33f)
                verticalLineToRelative(3.322f)
                horizontalLineToRelative(3.34f)
                verticalLineTo(4.002f)
                close()
            }
        }
        .build()
        return _hCircle!!
    }

private var _hCircle: ImageVector? = null
