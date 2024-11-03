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

public val Twbs.TvFill: ImageVector
    get() {
        if (_tvFill != null) {
            return _tvFill!!
        }
        _tvFill = Builder(name = "TvFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5f, 13.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 3.0f, 13.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineTo(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                moveTo(2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                reflectiveCurveToRelative(2.0f, 0.0f, 2.0f, 2.0f)
                verticalLineToRelative(6.0f)
                reflectiveCurveToRelative(0.0f, 2.0f, -2.0f, 2.0f)
                horizontalLineTo(2.0f)
                reflectiveCurveToRelative(-2.0f, 0.0f, -2.0f, -2.0f)
                verticalLineTo(4.0f)
                reflectiveCurveToRelative(0.0f, -2.0f, 2.0f, -2.0f)
            }
        }
        .build()
        return _tvFill!!
    }

private var _tvFill: ImageVector? = null
