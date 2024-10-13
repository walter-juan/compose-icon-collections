package com.woowla.compose.icon.collections.devicons.devicons.karma

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.KarmaGroup

public val KarmaGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF56C5A8)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(77.28f, 89.58f)
                lineToRelative(19.63f, 37.84f)
                horizontalLineToRelative(31.02f)
                lineToRelative(-35.15f, -67.14f)
                lineToRelative(-15.49f, 29.3f)
                moveToRelative(-62.53f, 20.29f)
                lineToRelative(14.37f, -17.5f)
                lineToRelative(22.97f, 35.05f)
                lineToRelative(-14.75f, -70.3f)
                lineToRelative(-12.45f, 26.47f)
                lineToRelative(-10.14f, 26.28f)
                moveToRelative(0.0f, 0.0f)
                lineTo(37.34f, 57.12f)
                lineTo(22.98f, 74.63f)
                lineTo(0.0f, 39.58f)
                lineToRelative(14.75f, 70.3f)
                moveTo(124.97f, 0.39f)
                horizontalLineToRelative(-31.02f)
                lineToRelative(-19.0f, 36.28f)
                verticalLineTo(0.39f)
                horizontalLineTo(46.49f)
                verticalLineToRelative(37.63f)
                lineToRelative(15.17f, 72.28f)
                lineToRelative(3.54f, 17.12f)
                horizontalLineToRelative(9.75f)
                verticalLineTo(95.66f)
                lineTo(124.97f, 0.39f)
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
