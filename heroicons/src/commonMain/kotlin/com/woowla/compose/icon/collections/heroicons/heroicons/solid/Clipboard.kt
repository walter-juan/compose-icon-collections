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

public val SolidGroup.Clipboard: ImageVector
    get() {
        if (_clipboard != null) {
            return _clipboard!!
        }
        _clipboard = Builder(name = "Clipboard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.5f, 3.0f)
                curveTo(9.814f, 3.0f, 9.234f, 3.461f, 9.056f, 4.091f)
                curveTo(9.02f, 4.22f, 9.0f, 4.357f, 9.0f, 4.5f)
                horizontalLineTo(15.0f)
                curveTo(15.0f, 4.357f, 14.98f, 4.22f, 14.944f, 4.091f)
                curveTo(14.766f, 3.461f, 14.186f, 3.0f, 13.5f, 3.0f)
                horizontalLineTo(10.5f)
                close()
                moveTo(7.807f, 3.178f)
                curveTo(8.295f, 2.184f, 9.317f, 1.5f, 10.5f, 1.5f)
                horizontalLineTo(13.5f)
                curveTo(14.683f, 1.5f, 15.705f, 2.184f, 16.194f, 3.178f)
                curveTo(16.691f, 3.22f, 17.187f, 3.27f, 17.68f, 3.327f)
                curveTo(19.177f, 3.501f, 20.25f, 4.787f, 20.25f, 6.257f)
                verticalLineTo(19.5f)
                curveTo(20.25f, 21.157f, 18.907f, 22.5f, 17.25f, 22.5f)
                horizontalLineTo(6.75f)
                curveTo(5.093f, 22.5f, 3.75f, 21.157f, 3.75f, 19.5f)
                verticalLineTo(6.257f)
                curveTo(3.75f, 4.787f, 4.823f, 3.501f, 6.32f, 3.327f)
                curveTo(6.813f, 3.27f, 7.309f, 3.22f, 7.807f, 3.178f)
                close()
            }
        }
        .build()
        return _clipboard!!
    }

private var _clipboard: ImageVector? = null
