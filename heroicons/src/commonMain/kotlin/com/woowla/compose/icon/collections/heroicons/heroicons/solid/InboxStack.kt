package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.InboxStack: ImageVector
    get() {
        if (_inboxStack != null) {
            return _inboxStack!!
        }
        _inboxStack = Builder(name = "InboxStack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.5f, 9.832f)
                verticalLineTo(11.625f)
                curveTo(1.5f, 12.66f, 2.339f, 13.5f, 3.375f, 13.5f)
                horizontalLineTo(20.625f)
                curveTo(21.66f, 13.5f, 22.5f, 12.66f, 22.5f, 11.625f)
                verticalLineTo(9.832f)
                curveTo(22.5f, 9.116f, 22.244f, 8.424f, 21.778f, 7.88f)
                lineTo(18.493f, 4.048f)
                curveTo(17.923f, 3.383f, 17.091f, 3.0f, 16.215f, 3.0f)
                horizontalLineTo(7.785f)
                curveTo(6.909f, 3.0f, 6.077f, 3.383f, 5.507f, 4.048f)
                lineTo(2.222f, 7.88f)
                curveTo(1.756f, 8.424f, 1.5f, 9.116f, 1.5f, 9.832f)
                close()
                moveTo(7.785f, 4.5f)
                curveTo(7.347f, 4.5f, 6.931f, 4.691f, 6.646f, 5.024f)
                lineTo(3.881f, 8.25f)
                horizontalLineTo(7.046f)
                curveTo(8.049f, 8.25f, 8.986f, 8.751f, 9.542f, 9.586f)
                lineTo(9.706f, 9.832f)
                curveTo(9.984f, 10.249f, 10.453f, 10.5f, 10.954f, 10.5f)
                horizontalLineTo(13.046f)
                curveTo(13.547f, 10.5f, 14.016f, 10.249f, 14.294f, 9.832f)
                lineTo(14.458f, 9.586f)
                curveTo(15.014f, 8.751f, 15.951f, 8.25f, 16.954f, 8.25f)
                horizontalLineTo(20.119f)
                lineTo(17.354f, 5.024f)
                curveTo(17.069f, 4.691f, 16.653f, 4.5f, 16.215f, 4.5f)
                horizontalLineTo(7.785f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.813f, 15.0f)
                curveTo(2.088f, 15.0f, 1.5f, 15.588f, 1.5f, 16.313f)
                verticalLineTo(18.0f)
                curveTo(1.5f, 19.657f, 2.843f, 21.0f, 4.5f, 21.0f)
                horizontalLineTo(19.5f)
                curveTo(21.157f, 21.0f, 22.5f, 19.657f, 22.5f, 18.0f)
                verticalLineTo(16.313f)
                curveTo(22.5f, 15.588f, 21.912f, 15.0f, 21.188f, 15.0f)
                horizontalLineTo(16.954f)
                curveTo(15.951f, 15.0f, 15.014f, 15.501f, 14.458f, 16.336f)
                lineTo(14.294f, 16.582f)
                curveTo(14.016f, 16.999f, 13.547f, 17.25f, 13.046f, 17.25f)
                horizontalLineTo(10.954f)
                curveTo(10.453f, 17.25f, 9.984f, 16.999f, 9.706f, 16.582f)
                lineTo(9.542f, 16.336f)
                curveTo(8.986f, 15.501f, 8.049f, 15.0f, 7.046f, 15.0f)
                horizontalLineTo(2.813f)
                close()
            }
        }
        .build()
        return _inboxStack!!
    }

private var _inboxStack: ImageVector? = null
