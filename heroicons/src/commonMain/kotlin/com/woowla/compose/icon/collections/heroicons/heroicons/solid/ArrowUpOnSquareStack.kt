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

public val SolidGroup.ArrowUpOnSquareStack: ImageVector
    get() {
        if (_arrowUpOnSquareStack != null) {
            return _arrowUpOnSquareStack!!
        }
        _arrowUpOnSquareStack = Builder(name = "ArrowUpOnSquareStack", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.97f, 0.97f)
                curveTo(10.263f, 0.677f, 10.737f, 0.677f, 11.03f, 0.97f)
                lineTo(14.03f, 3.97f)
                curveTo(14.323f, 4.263f, 14.323f, 4.737f, 14.03f, 5.03f)
                curveTo(13.737f, 5.323f, 13.263f, 5.323f, 12.97f, 5.03f)
                lineTo(11.25f, 3.311f)
                verticalLineTo(6.75f)
                horizontalLineTo(9.75f)
                verticalLineTo(3.311f)
                lineTo(8.03f, 5.03f)
                curveTo(7.737f, 5.323f, 7.263f, 5.323f, 6.97f, 5.03f)
                curveTo(6.677f, 4.737f, 6.677f, 4.263f, 6.97f, 3.97f)
                lineTo(9.97f, 0.97f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.75f, 6.75f)
                verticalLineTo(12.75f)
                curveTo(9.75f, 13.164f, 10.086f, 13.5f, 10.5f, 13.5f)
                curveTo(10.914f, 13.5f, 11.25f, 13.164f, 11.25f, 12.75f)
                verticalLineTo(6.75f)
                horizontalLineTo(14.25f)
                curveTo(15.907f, 6.75f, 17.25f, 8.093f, 17.25f, 9.75f)
                verticalLineTo(17.25f)
                curveTo(17.25f, 18.907f, 15.907f, 20.25f, 14.25f, 20.25f)
                horizontalLineTo(6.75f)
                curveTo(5.093f, 20.25f, 3.75f, 18.907f, 3.75f, 17.25f)
                verticalLineTo(9.75f)
                curveTo(3.75f, 8.093f, 5.093f, 6.75f, 6.75f, 6.75f)
                horizontalLineTo(9.75f)
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
        return _arrowUpOnSquareStack!!
    }

private var _arrowUpOnSquareStack: ImageVector? = null
