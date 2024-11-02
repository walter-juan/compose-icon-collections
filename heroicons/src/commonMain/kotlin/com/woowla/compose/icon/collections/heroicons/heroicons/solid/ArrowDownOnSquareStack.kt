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

public val SolidGroup.ArrowDownOnSquareStack: ImageVector
    get() {
        if (_arrowDownOnSquareStack != null) {
            return _arrowDownOnSquareStack!!
        }
        _arrowDownOnSquareStack = Builder(name = "ArrowDownOnSquareStack", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.75f, 6.75f)
                horizontalLineTo(6.75f)
                curveTo(5.093f, 6.75f, 3.75f, 8.093f, 3.75f, 9.75f)
                verticalLineTo(17.25f)
                curveTo(3.75f, 18.907f, 5.093f, 20.25f, 6.75f, 20.25f)
                horizontalLineTo(14.25f)
                curveTo(15.907f, 20.25f, 17.25f, 18.907f, 17.25f, 17.25f)
                verticalLineTo(9.75f)
                curveTo(17.25f, 8.093f, 15.907f, 6.75f, 14.25f, 6.75f)
                horizontalLineTo(11.25f)
                lineTo(11.25f, 1.5f)
                curveTo(11.25f, 1.086f, 10.914f, 0.75f, 10.5f, 0.75f)
                curveTo(10.086f, 0.75f, 9.75f, 1.086f, 9.75f, 1.5f)
                verticalLineTo(6.75f)
                close()
                moveTo(9.75f, 6.75f)
                horizontalLineTo(11.25f)
                verticalLineTo(12.439f)
                lineTo(12.97f, 10.72f)
                curveTo(13.263f, 10.427f, 13.737f, 10.427f, 14.03f, 10.72f)
                curveTo(14.323f, 11.013f, 14.323f, 11.487f, 14.03f, 11.78f)
                lineTo(11.03f, 14.78f)
                curveTo(10.737f, 15.073f, 10.263f, 15.073f, 9.97f, 14.78f)
                lineTo(6.97f, 11.78f)
                curveTo(6.677f, 11.487f, 6.677f, 11.013f, 6.97f, 10.72f)
                curveTo(7.263f, 10.427f, 7.737f, 10.427f, 8.03f, 10.72f)
                lineTo(9.75f, 12.439f)
                verticalLineTo(6.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.151f, 21.75f)
                curveTo(7.67f, 22.647f, 8.64f, 23.25f, 9.75f, 23.25f)
                horizontalLineTo(17.25f)
                curveTo(18.907f, 23.25f, 20.25f, 21.907f, 20.25f, 20.25f)
                verticalLineTo(12.75f)
                curveTo(20.25f, 11.64f, 19.647f, 10.67f, 18.75f, 10.151f)
                verticalLineTo(17.25f)
                curveTo(18.75f, 19.735f, 16.735f, 21.75f, 14.25f, 21.75f)
                horizontalLineTo(7.151f)
                close()
            }
        }
        .build()
        return _arrowDownOnSquareStack!!
    }

private var _arrowDownOnSquareStack: ImageVector? = null
