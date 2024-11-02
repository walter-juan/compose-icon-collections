package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val SolidGroup.ServerStack: ImageVector
    get() {
        if (_serverStack != null) {
            return _serverStack!!
        }
        _serverStack = Builder(name = "ServerStack", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.507f, 4.048f)
                curveTo(6.077f, 3.383f, 6.909f, 3.0f, 7.785f, 3.0f)
                horizontalLineTo(16.215f)
                curveTo(17.091f, 3.0f, 17.923f, 3.383f, 18.493f, 4.048f)
                lineTo(20.215f, 6.056f)
                curveTo(19.982f, 6.019f, 19.743f, 6.0f, 19.5f, 6.0f)
                horizontalLineTo(4.5f)
                curveTo(4.257f, 6.0f, 4.018f, 6.019f, 3.785f, 6.056f)
                lineTo(5.507f, 4.048f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.5f, 10.5f)
                curveTo(1.5f, 8.843f, 2.843f, 7.5f, 4.5f, 7.5f)
                horizontalLineTo(19.5f)
                curveTo(21.157f, 7.5f, 22.5f, 8.843f, 22.5f, 10.5f)
                curveTo(22.5f, 12.157f, 21.157f, 13.5f, 19.5f, 13.5f)
                horizontalLineTo(4.5f)
                curveTo(2.843f, 13.5f, 1.5f, 12.157f, 1.5f, 10.5f)
                close()
                moveTo(16.5f, 10.5f)
                curveTo(16.5f, 10.914f, 16.164f, 11.25f, 15.75f, 11.25f)
                curveTo(15.336f, 11.25f, 15.0f, 10.914f, 15.0f, 10.5f)
                curveTo(15.0f, 10.086f, 15.336f, 9.75f, 15.75f, 9.75f)
                curveTo(16.164f, 9.75f, 16.5f, 10.086f, 16.5f, 10.5f)
                close()
                moveTo(18.75f, 11.25f)
                curveTo(19.164f, 11.25f, 19.5f, 10.914f, 19.5f, 10.5f)
                curveTo(19.5f, 10.086f, 19.164f, 9.75f, 18.75f, 9.75f)
                curveTo(18.336f, 9.75f, 18.0f, 10.086f, 18.0f, 10.5f)
                curveTo(18.0f, 10.914f, 18.336f, 11.25f, 18.75f, 11.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.5f, 15.0f)
                curveTo(2.843f, 15.0f, 1.5f, 16.343f, 1.5f, 18.0f)
                curveTo(1.5f, 19.657f, 2.843f, 21.0f, 4.5f, 21.0f)
                horizontalLineTo(19.5f)
                curveTo(21.157f, 21.0f, 22.5f, 19.657f, 22.5f, 18.0f)
                curveTo(22.5f, 16.343f, 21.157f, 15.0f, 19.5f, 15.0f)
                horizontalLineTo(4.5f)
                close()
                moveTo(15.75f, 18.75f)
                curveTo(16.164f, 18.75f, 16.5f, 18.414f, 16.5f, 18.0f)
                curveTo(16.5f, 17.586f, 16.164f, 17.25f, 15.75f, 17.25f)
                curveTo(15.336f, 17.25f, 15.0f, 17.586f, 15.0f, 18.0f)
                curveTo(15.0f, 18.414f, 15.336f, 18.75f, 15.75f, 18.75f)
                close()
                moveTo(19.5f, 18.0f)
                curveTo(19.5f, 18.414f, 19.164f, 18.75f, 18.75f, 18.75f)
                curveTo(18.336f, 18.75f, 18.0f, 18.414f, 18.0f, 18.0f)
                curveTo(18.0f, 17.586f, 18.336f, 17.25f, 18.75f, 17.25f)
                curveTo(19.164f, 17.25f, 19.5f, 17.586f, 19.5f, 18.0f)
                close()
            }
        }
        .build()
        return _serverStack!!
    }

private var _serverStack: ImageVector? = null
