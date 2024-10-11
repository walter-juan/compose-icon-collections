package com.woowla.compose.icon.collections.remix.remix.development

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DevelopmentGroup

public val DevelopmentGroup.GitForkLine: ImageVector
    get() {
        if (_gitForkLine != null) {
            return _gitForkLine!!
        }
        _gitForkLine = Builder(name = "GitForkLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 5.0f)
                curveTo(5.448f, 5.0f, 5.0f, 5.448f, 5.0f, 6.0f)
                curveTo(5.0f, 6.552f, 5.448f, 7.0f, 6.0f, 7.0f)
                curveTo(6.552f, 7.0f, 7.0f, 6.552f, 7.0f, 6.0f)
                curveTo(7.0f, 5.448f, 6.552f, 5.0f, 6.0f, 5.0f)
                close()
                moveTo(3.0f, 6.0f)
                curveTo(3.0f, 4.343f, 4.343f, 3.0f, 6.0f, 3.0f)
                curveTo(7.657f, 3.0f, 9.0f, 4.343f, 9.0f, 6.0f)
                curveTo(9.0f, 7.306f, 8.165f, 8.417f, 7.0f, 8.829f)
                verticalLineTo(9.0f)
                curveTo(7.0f, 10.105f, 7.895f, 11.0f, 9.0f, 11.0f)
                horizontalLineTo(15.0f)
                curveTo(16.105f, 11.0f, 17.0f, 10.105f, 17.0f, 9.0f)
                verticalLineTo(8.829f)
                curveTo(15.835f, 8.417f, 15.0f, 7.306f, 15.0f, 6.0f)
                curveTo(15.0f, 4.343f, 16.343f, 3.0f, 18.0f, 3.0f)
                curveTo(19.657f, 3.0f, 21.0f, 4.343f, 21.0f, 6.0f)
                curveTo(21.0f, 7.306f, 20.165f, 8.417f, 19.0f, 8.829f)
                verticalLineTo(9.0f)
                curveTo(19.0f, 11.209f, 17.209f, 13.0f, 15.0f, 13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.171f)
                curveTo(14.165f, 15.583f, 15.0f, 16.694f, 15.0f, 18.0f)
                curveTo(15.0f, 19.657f, 13.657f, 21.0f, 12.0f, 21.0f)
                curveTo(10.343f, 21.0f, 9.0f, 19.657f, 9.0f, 18.0f)
                curveTo(9.0f, 16.694f, 9.835f, 15.583f, 11.0f, 15.171f)
                verticalLineTo(13.0f)
                horizontalLineTo(9.0f)
                curveTo(6.791f, 13.0f, 5.0f, 11.209f, 5.0f, 9.0f)
                verticalLineTo(8.829f)
                curveTo(3.835f, 8.417f, 3.0f, 7.306f, 3.0f, 6.0f)
                close()
                moveTo(18.0f, 5.0f)
                curveTo(17.448f, 5.0f, 17.0f, 5.448f, 17.0f, 6.0f)
                curveTo(17.0f, 6.552f, 17.448f, 7.0f, 18.0f, 7.0f)
                curveTo(18.552f, 7.0f, 19.0f, 6.552f, 19.0f, 6.0f)
                curveTo(19.0f, 5.448f, 18.552f, 5.0f, 18.0f, 5.0f)
                close()
                moveTo(12.0f, 17.0f)
                curveTo(11.448f, 17.0f, 11.0f, 17.448f, 11.0f, 18.0f)
                curveTo(11.0f, 18.552f, 11.448f, 19.0f, 12.0f, 19.0f)
                curveTo(12.552f, 19.0f, 13.0f, 18.552f, 13.0f, 18.0f)
                curveTo(13.0f, 17.448f, 12.552f, 17.0f, 12.0f, 17.0f)
                close()
            }
        }
        .build()
        return _gitForkLine!!
    }

private var _gitForkLine: ImageVector? = null
