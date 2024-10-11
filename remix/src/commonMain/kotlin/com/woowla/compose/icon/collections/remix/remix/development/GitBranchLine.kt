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

public val DevelopmentGroup.GitBranchLine: ImageVector
    get() {
        if (_gitBranchLine != null) {
            return _gitBranchLine!!
        }
        _gitBranchLine = Builder(name = "GitBranchLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.105f, 15.21f)
                curveTo(8.215f, 15.65f, 9.0f, 16.733f, 9.0f, 18.0f)
                curveTo(9.0f, 19.657f, 7.657f, 21.0f, 6.0f, 21.0f)
                curveTo(4.343f, 21.0f, 3.0f, 19.657f, 3.0f, 18.0f)
                curveTo(3.0f, 16.694f, 3.835f, 15.583f, 5.0f, 15.171f)
                verticalLineTo(8.829f)
                curveTo(3.835f, 8.417f, 3.0f, 7.306f, 3.0f, 6.0f)
                curveTo(3.0f, 4.343f, 4.343f, 3.0f, 6.0f, 3.0f)
                curveTo(7.657f, 3.0f, 9.0f, 4.343f, 9.0f, 6.0f)
                curveTo(9.0f, 7.306f, 8.165f, 8.417f, 7.0f, 8.829f)
                verticalLineTo(12.0f)
                curveTo(7.836f, 11.372f, 8.874f, 11.0f, 10.0f, 11.0f)
                horizontalLineTo(14.0f)
                curveTo(15.384f, 11.0f, 16.548f, 10.064f, 16.895f, 8.79f)
                curveTo(15.785f, 8.35f, 15.0f, 7.267f, 15.0f, 6.0f)
                curveTo(15.0f, 4.343f, 16.343f, 3.0f, 18.0f, 3.0f)
                curveTo(19.657f, 3.0f, 21.0f, 4.343f, 21.0f, 6.0f)
                curveTo(21.0f, 7.333f, 20.13f, 8.463f, 18.927f, 8.854f)
                curveTo(18.522f, 11.208f, 16.47f, 13.0f, 14.0f, 13.0f)
                horizontalLineTo(10.0f)
                curveTo(8.617f, 13.0f, 7.452f, 13.936f, 7.105f, 15.21f)
                close()
                moveTo(6.0f, 17.0f)
                curveTo(5.448f, 17.0f, 5.0f, 17.448f, 5.0f, 18.0f)
                curveTo(5.0f, 18.552f, 5.448f, 19.0f, 6.0f, 19.0f)
                curveTo(6.552f, 19.0f, 7.0f, 18.552f, 7.0f, 18.0f)
                curveTo(7.0f, 17.448f, 6.552f, 17.0f, 6.0f, 17.0f)
                close()
                moveTo(6.0f, 5.0f)
                curveTo(5.448f, 5.0f, 5.0f, 5.448f, 5.0f, 6.0f)
                curveTo(5.0f, 6.552f, 5.448f, 7.0f, 6.0f, 7.0f)
                curveTo(6.552f, 7.0f, 7.0f, 6.552f, 7.0f, 6.0f)
                curveTo(7.0f, 5.448f, 6.552f, 5.0f, 6.0f, 5.0f)
                close()
                moveTo(18.0f, 5.0f)
                curveTo(17.448f, 5.0f, 17.0f, 5.448f, 17.0f, 6.0f)
                curveTo(17.0f, 6.552f, 17.448f, 7.0f, 18.0f, 7.0f)
                curveTo(18.552f, 7.0f, 19.0f, 6.552f, 19.0f, 6.0f)
                curveTo(19.0f, 5.448f, 18.552f, 5.0f, 18.0f, 5.0f)
                close()
            }
        }
        .build()
        return _gitBranchLine!!
    }

private var _gitBranchLine: ImageVector? = null
