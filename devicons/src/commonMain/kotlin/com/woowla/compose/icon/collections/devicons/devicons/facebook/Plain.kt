package com.woowla.compose.icon.collections.devicons.devicons.facebook

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.FacebookGroup

public val FacebookGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF3d5a98)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.42f, 5.07f)
                horizontalLineTo(11.58f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -6.5f, 6.5f)
                verticalLineToRelative(104.85f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 6.5f, 6.5f)
                horizontalLineTo(68.0f)
                verticalLineTo(77.29f)
                horizontalLineTo(52.66f)
                verticalLineTo(59.5f)
                horizontalLineTo(68.0f)
                verticalLineTo(46.38f)
                curveToRelative(0.0f, -15.22f, 9.3f, -23.51f, 22.88f, -23.51f)
                arcToRelative(126.0f, 126.0f, 0.0f, false, true, 13.72f, 0.7f)
                verticalLineToRelative(15.91f)
                horizontalLineToRelative(-9.39f)
                curveToRelative(-7.39f, 0.0f, -8.82f, 3.51f, -8.82f, 8.66f)
                verticalLineTo(59.5f)
                horizontalLineTo(104.0f)
                lineToRelative(-2.29f, 17.79f)
                horizontalLineTo(86.39f)
                verticalLineToRelative(45.64f)
                horizontalLineToRelative(30.0f)
                arcToRelative(6.51f, 6.51f, 0.0f, false, false, 6.5f, -6.5f)
                verticalLineTo(11.58f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -6.47f, -6.51f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
