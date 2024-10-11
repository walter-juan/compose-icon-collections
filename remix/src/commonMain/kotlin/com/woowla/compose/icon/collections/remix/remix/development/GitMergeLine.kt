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

public val DevelopmentGroup.GitMergeLine: ImageVector
    get() {
        if (_gitMergeLine != null) {
            return _gitMergeLine!!
        }
        _gitMergeLine = Builder(name = "GitMergeLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.105f, 8.79f)
                curveTo(7.452f, 10.064f, 8.617f, 11.0f, 10.0f, 11.0f)
                horizontalLineTo(14.0f)
                curveTo(16.47f, 11.0f, 18.522f, 12.792f, 18.927f, 15.146f)
                curveTo(20.13f, 15.537f, 21.0f, 16.667f, 21.0f, 18.0f)
                curveTo(21.0f, 19.657f, 19.657f, 21.0f, 18.0f, 21.0f)
                curveTo(16.343f, 21.0f, 15.0f, 19.657f, 15.0f, 18.0f)
                curveTo(15.0f, 16.733f, 15.785f, 15.65f, 16.895f, 15.21f)
                curveTo(16.548f, 13.936f, 15.384f, 13.0f, 14.0f, 13.0f)
                horizontalLineTo(10.0f)
                curveTo(8.874f, 13.0f, 7.836f, 12.628f, 7.0f, 12.0f)
                verticalLineTo(15.171f)
                curveTo(8.165f, 15.583f, 9.0f, 16.694f, 9.0f, 18.0f)
                curveTo(9.0f, 19.657f, 7.657f, 21.0f, 6.0f, 21.0f)
                curveTo(4.343f, 21.0f, 3.0f, 19.657f, 3.0f, 18.0f)
                curveTo(3.0f, 16.694f, 3.835f, 15.583f, 5.0f, 15.171f)
                verticalLineTo(8.829f)
                curveTo(3.835f, 8.417f, 3.0f, 7.306f, 3.0f, 6.0f)
                curveTo(3.0f, 4.343f, 4.343f, 3.0f, 6.0f, 3.0f)
                curveTo(7.657f, 3.0f, 9.0f, 4.343f, 9.0f, 6.0f)
                curveTo(9.0f, 7.267f, 8.215f, 8.35f, 7.105f, 8.79f)
                close()
                moveTo(6.0f, 7.0f)
                curveTo(6.552f, 7.0f, 7.0f, 6.552f, 7.0f, 6.0f)
                curveTo(7.0f, 5.448f, 6.552f, 5.0f, 6.0f, 5.0f)
                curveTo(5.448f, 5.0f, 5.0f, 5.448f, 5.0f, 6.0f)
                curveTo(5.0f, 6.552f, 5.448f, 7.0f, 6.0f, 7.0f)
                close()
                moveTo(6.0f, 19.0f)
                curveTo(6.552f, 19.0f, 7.0f, 18.552f, 7.0f, 18.0f)
                curveTo(7.0f, 17.448f, 6.552f, 17.0f, 6.0f, 17.0f)
                curveTo(5.448f, 17.0f, 5.0f, 17.448f, 5.0f, 18.0f)
                curveTo(5.0f, 18.552f, 5.448f, 19.0f, 6.0f, 19.0f)
                close()
                moveTo(18.0f, 19.0f)
                curveTo(18.552f, 19.0f, 19.0f, 18.552f, 19.0f, 18.0f)
                curveTo(19.0f, 17.448f, 18.552f, 17.0f, 18.0f, 17.0f)
                curveTo(17.448f, 17.0f, 17.0f, 17.448f, 17.0f, 18.0f)
                curveTo(17.0f, 18.552f, 17.448f, 19.0f, 18.0f, 19.0f)
                close()
            }
        }
        .build()
        return _gitMergeLine!!
    }

private var _gitMergeLine: ImageVector? = null
