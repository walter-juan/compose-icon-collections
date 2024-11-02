package com.woowla.compose.icon.collections.heroicons.heroicons.solid

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
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.QueueList: ImageVector
    get() {
        if (_queueList != null) {
            return _queueList!!
        }
        _queueList = Builder(name = "QueueList", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.625f, 3.75f)
                curveTo(4.175f, 3.75f, 3.0f, 4.925f, 3.0f, 6.375f)
                curveTo(3.0f, 7.825f, 4.175f, 9.0f, 5.625f, 9.0f)
                horizontalLineTo(18.375f)
                curveTo(19.825f, 9.0f, 21.0f, 7.825f, 21.0f, 6.375f)
                curveTo(21.0f, 4.925f, 19.825f, 3.75f, 18.375f, 3.75f)
                horizontalLineTo(5.625f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.75f, 11.25f)
                curveTo(3.336f, 11.25f, 3.0f, 11.586f, 3.0f, 12.0f)
                curveTo(3.0f, 12.414f, 3.336f, 12.75f, 3.75f, 12.75f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 12.75f, 21.0f, 12.414f, 21.0f, 12.0f)
                curveTo(21.0f, 11.586f, 20.664f, 11.25f, 20.25f, 11.25f)
                horizontalLineTo(3.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 15.75f)
                curveTo(3.0f, 15.336f, 3.336f, 15.0f, 3.75f, 15.0f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 15.0f, 21.0f, 15.336f, 21.0f, 15.75f)
                curveTo(21.0f, 16.164f, 20.664f, 16.5f, 20.25f, 16.5f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 16.5f, 3.0f, 16.164f, 3.0f, 15.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.75f, 18.75f)
                curveTo(3.336f, 18.75f, 3.0f, 19.086f, 3.0f, 19.5f)
                curveTo(3.0f, 19.914f, 3.336f, 20.25f, 3.75f, 20.25f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 20.25f, 21.0f, 19.914f, 21.0f, 19.5f)
                curveTo(21.0f, 19.086f, 20.664f, 18.75f, 20.25f, 18.75f)
                horizontalLineTo(3.75f)
                close()
            }
        }
        .build()
        return _queueList!!
    }

private var _queueList: ImageVector? = null
