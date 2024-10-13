package com.woowla.compose.icon.collections.devicons.devicons.rect

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.RectGroup

public val RectGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF292929)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(127.83f, 0.17f)
                lineTo(0.17f, 0.17f)
                verticalLineToRelative(127.66f)
                horizontalLineToRelative(127.66f)
                verticalLineToRelative(-23.98f)
                horizontalLineToRelative(-8.28f)
                verticalLineToRelative(17.25f)
                horizontalLineToRelative(-4.48f)
                verticalLineToRelative(-17.25f)
                horizontalLineToRelative(-8.45f)
                verticalLineToRelative(-4.31f)
                horizontalLineToRelative(21.22f)
                close()
                moveTo(54.85f, 99.54f)
                horizontalLineToRelative(21.57f)
                verticalLineToRelative(4.31f)
                lineTo(59.17f, 103.85f)
                verticalLineToRelative(4.31f)
                horizontalLineToRelative(8.45f)
                verticalLineToRelative(4.31f)
                horizontalLineToRelative(-8.45f)
                verticalLineToRelative(4.31f)
                horizontalLineToRelative(17.25f)
                verticalLineToRelative(4.32f)
                lineTo(54.85f, 121.1f)
                close()
                moveTo(80.74f, 99.54f)
                horizontalLineToRelative(21.39f)
                verticalLineToRelative(4.31f)
                lineTo(85.05f, 103.85f)
                verticalLineToRelative(12.94f)
                horizontalLineToRelative(17.08f)
                verticalLineToRelative(4.32f)
                horizontalLineToRelative(-21.39f)
                close()
                moveTo(28.81f, 99.54f)
                lineTo(50.37f, 99.54f)
                verticalLineToRelative(12.94f)
                lineTo(46.06f, 112.47f)
                verticalLineToRelative(4.31f)
                horizontalLineToRelative(-4.31f)
                verticalLineToRelative(-4.31f)
                horizontalLineToRelative(-8.63f)
                verticalLineToRelative(8.63f)
                lineTo(28.81f, 121.1f)
                close()
                moveTo(46.06f, 116.79f)
                verticalLineToRelative(4.32f)
                horizontalLineToRelative(4.31f)
                verticalLineToRelative(-4.32f)
                close()
                moveTo(46.06f, 103.85f)
                verticalLineToRelative(4.31f)
                lineTo(33.12f, 108.16f)
                verticalLineToRelative(-4.31f)
                close()
                moveTo(46.06f, 103.85f)
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
