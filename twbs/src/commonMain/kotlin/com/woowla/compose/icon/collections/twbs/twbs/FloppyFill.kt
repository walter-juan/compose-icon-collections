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

public val Twbs.FloppyFill: ImageVector
    get() {
        if (_floppyFill != null) {
            return _floppyFill!!
        }
        _floppyFill = Builder(name = "FloppyFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 1.5f, 0.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(5.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 4.5f, 7.0f)
                horizontalLineToRelative(7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.0f, 5.5f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(0.086f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.06f, 0.44f)
                lineToRelative(1.415f, 1.414f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.0f, 2.914f)
                verticalLineTo(14.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineTo(14.0f)
                verticalLineToRelative(-5.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.5f, 9.0f)
                horizontalLineToRelative(-9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 2.0f, 10.5f)
                verticalLineTo(16.0f)
                horizontalLineToRelative(-0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 0.0f, 14.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 16.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                close()
                moveTo(12.0f, 0.0f)
                lineTo(4.0f, 0.0f)
                verticalLineToRelative(5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                close()
                moveTo(9.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                lineTo(9.0f, 5.0f)
                close()
            }
        }
        .build()
        return _floppyFill!!
    }

private var _floppyFill: ImageVector? = null
