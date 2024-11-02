package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.Underline: ImageVector
    get() {
        if (_underline != null) {
            return _underline!!
        }
        _underline = Builder(name = "Underline", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.995f, 2.994f)
                curveTo(6.409f, 2.994f, 6.745f, 3.33f, 6.745f, 3.744f)
                verticalLineTo(11.245f)
                curveTo(6.745f, 14.145f, 9.096f, 16.495f, 11.995f, 16.495f)
                curveTo(14.894f, 16.495f, 17.245f, 14.145f, 17.245f, 11.245f)
                verticalLineTo(3.744f)
                curveTo(17.245f, 3.33f, 17.581f, 2.994f, 17.995f, 2.994f)
                curveTo(18.409f, 2.994f, 18.745f, 3.33f, 18.745f, 3.744f)
                verticalLineTo(11.245f)
                curveTo(18.745f, 14.973f, 15.723f, 17.996f, 11.995f, 17.996f)
                curveTo(8.267f, 17.996f, 5.245f, 14.973f, 5.245f, 11.245f)
                verticalLineTo(3.744f)
                curveTo(5.245f, 3.33f, 5.581f, 2.994f, 5.995f, 2.994f)
                close()
                moveTo(2.995f, 20.246f)
                curveTo(2.995f, 19.831f, 3.331f, 19.496f, 3.745f, 19.496f)
                horizontalLineTo(20.245f)
                curveTo(20.659f, 19.496f, 20.995f, 19.831f, 20.995f, 20.246f)
                curveTo(20.995f, 20.66f, 20.659f, 20.996f, 20.245f, 20.996f)
                horizontalLineTo(3.745f)
                curveTo(3.331f, 20.996f, 2.995f, 20.66f, 2.995f, 20.246f)
                close()
            }
        }
        .build()
        return _underline!!
    }

private var _underline: ImageVector? = null
