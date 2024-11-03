package com.woowla.compose.icon.collections.twbs.twbs

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
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Smartwatch: ImageVector
    get() {
        if (_smartwatch != null) {
            return _smartwatch!!
        }
        _smartwatch = Builder(name = "Smartwatch", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 1.667f)
                verticalLineToRelative(0.383f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 2.0f, 4.5f)
                verticalLineToRelative(7.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.0f, 2.45f)
                verticalLineToRelative(0.383f)
                curveTo(4.0f, 15.253f, 4.746f, 16.0f, 5.667f, 16.0f)
                horizontalLineToRelative(4.666f)
                curveToRelative(0.92f, 0.0f, 1.667f, -0.746f, 1.667f, -1.667f)
                verticalLineToRelative(-0.383f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.0f, -2.45f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                horizontalLineTo(14.0f)
                verticalLineToRelative(-0.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.0f, -2.45f)
                verticalLineToRelative(-0.383f)
                curveTo(12.0f, 0.747f, 11.254f, 0.0f, 10.333f, 0.0f)
                horizontalLineTo(5.667f)
                curveTo(4.747f, 0.0f, 4.0f, 0.746f, 4.0f, 1.667f)
                moveTo(4.5f, 3.0f)
                horizontalLineToRelative(7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.0f, 4.5f)
                verticalLineToRelative(7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.0f, 11.5f)
                verticalLineToRelative(-7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.5f, 3.0f)
            }
        }
        .build()
        return _smartwatch!!
    }

private var _smartwatch: ImageVector? = null
