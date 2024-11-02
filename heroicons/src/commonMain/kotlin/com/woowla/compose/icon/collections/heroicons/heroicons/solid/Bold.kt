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

public val SolidGroup.Bold: ImageVector
    get() {
        if (_bold != null) {
            return _bold!!
        }
        _bold = Builder(name = "Bold", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.246f, 3.744f)
                curveTo(5.246f, 3.33f, 5.582f, 2.994f, 5.996f, 2.994f)
                horizontalLineTo(13.121f)
                curveTo(15.813f, 2.994f, 17.996f, 5.177f, 17.996f, 7.87f)
                curveTo(17.996f, 9.267f, 17.408f, 10.527f, 16.467f, 11.416f)
                curveTo(17.843f, 12.362f, 18.746f, 13.948f, 18.746f, 15.745f)
                curveTo(18.746f, 18.645f, 16.396f, 20.996f, 13.496f, 20.996f)
                horizontalLineTo(5.996f)
                curveTo(5.582f, 20.996f, 5.246f, 20.66f, 5.246f, 20.246f)
                verticalLineTo(3.744f)
                close()
                moveTo(12.371f, 10.495f)
                curveTo(13.821f, 10.495f, 14.996f, 9.32f, 14.996f, 7.87f)
                curveTo(14.996f, 6.42f, 13.821f, 5.244f, 12.371f, 5.244f)
                horizontalLineTo(8.246f)
                verticalLineTo(10.495f)
                horizontalLineTo(12.371f)
                close()
                moveTo(8.246f, 12.745f)
                verticalLineTo(18.746f)
                horizontalLineTo(12.746f)
                curveTo(14.403f, 18.746f, 15.746f, 17.402f, 15.746f, 15.745f)
                curveTo(15.746f, 14.088f, 14.403f, 12.745f, 12.746f, 12.745f)
                horizontalLineTo(8.246f)
                close()
            }
        }
        .build()
        return _bold!!
    }

private var _bold: ImageVector? = null
