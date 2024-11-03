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

public val Twbs.AppIndicator: ImageVector
    get() {
        if (_appIndicator != null) {
            return _appIndicator!!
        }
        _appIndicator = Builder(name = "AppIndicator", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 2.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 2.0f, 5.5f)
                verticalLineToRelative(5.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 5.5f, 14.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.5f, -3.5f)
                verticalLineTo(8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(2.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -4.5f, 4.5f)
                horizontalLineToRelative(-5.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 1.0f, 10.5f)
                verticalLineToRelative(-5.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 5.5f, 1.0f)
                horizontalLineTo(8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
            }
        }
        .build()
        return _appIndicator!!
    }

private var _appIndicator: ImageVector? = null
