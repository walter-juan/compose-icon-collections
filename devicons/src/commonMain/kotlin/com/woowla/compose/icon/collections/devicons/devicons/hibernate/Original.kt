package com.woowla.compose.icon.collections.devicons.devicons.hibernate

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
import com.woowla.compose.icon.collections.devicons.devicons.HibernateGroup

public val HibernateGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF59666c)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(29.25f, 3.77f)
                lineToRelative(23.17f, 40.13f)
                lineToRelative(-23.18f, 40.19f)
                lineToRelative(-23.16f, -40.19f)
                close()
                moveTo(98.75f, 124.23f)
                lineTo(75.59f, 84.11f)
                lineToRelative(23.18f, -40.19f)
                lineToRelative(23.16f, 40.19f)
                close()
                moveTo(98.75f, 124.23f)
            }
            path(fill = SolidColor(Color(0xFFbcae79)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(75.59f, 3.77f)
                lineTo(29.26f, 3.77f)
                lineTo(52.43f, 43.9f)
                horizontalLineToRelative(46.35f)
                close()
                moveTo(52.41f, 124.23f)
                lineTo(98.75f, 124.23f)
                lineTo(75.59f, 84.1f)
                lineTo(29.22f, 84.1f)
                close()
                moveTo(52.41f, 124.23f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
