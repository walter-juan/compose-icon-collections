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

public val Twbs.Easel: ImageVector
    get() {
        if (_easel != null) {
            return _easel!!
        }
        _easel = Builder(name = "Easel", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.473f, 0.337f)
                lineTo(9.046f, 2.0f)
                horizontalLineTo(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-1.85f)
                lineToRelative(1.323f, 3.837f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.946f, 0.326f)
                lineTo(11.092f, 11.0f)
                horizontalLineTo(8.5f)
                verticalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(4.908f)
                lineToRelative(-1.435f, 4.163f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.946f, -0.326f)
                lineTo(3.85f, 11.0f)
                horizontalLineTo(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(4.954f)
                lineTo(7.527f, 0.337f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 8.0f, 0.0f)
                moveTo(2.0f, 3.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(12.0f)
                verticalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _easel!!
    }

private var _easel: ImageVector? = null
